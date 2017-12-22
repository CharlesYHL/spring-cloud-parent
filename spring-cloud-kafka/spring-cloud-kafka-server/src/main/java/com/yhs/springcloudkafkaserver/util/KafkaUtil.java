package com.yhs.springcloudkafkaserver.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Charles
 * @Title: KafkaUtil
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:37
 */
public class KafkaUtil {


    private static Logger logger = LoggerFactory.getLogger(KafkaUtil.class);

    private static Properties prop_customer = null;

    private static ProducerConfig producerConfig = null;
    private static Producer<String, byte[]> producer = null;

    public static Properties getCustomerPro(String groupid)
    {
        if (prop_customer == null) {
            prop_customer = new Properties();

            System.out.print(KafkaPropertiesUtil.getKafkaZookeeperConnect());
            prop_customer.put("zookeeper.connect", KafkaPropertiesUtil.getKafkaZookeeperConnect());

            prop_customer.put("group.id", groupid);
            prop_customer.put("zookeeper.session.timeout.ms", "6000");
            prop_customer.put("zookeeper.sync.time.ms", "200");
            prop_customer.put("auto.commit.interval.ms", "1000");
            prop_customer.put("zookeeper.connection.timeout.ms", "30000");
        }

        return prop_customer;
    }

    public static ProducerConfig getProducerConfig()
    {
        if (producerConfig == null) {
            Properties properties = new Properties();
            properties.put("metadata.broker.list", KafkaPropertiesUtil.getKafkaBrokerList());

            properties.put("serializer.class", "kafka.serializer.DefaultEncoder");
            producerConfig = new ProducerConfig(properties);
        }
        return producerConfig;
    }

    public static Producer<String, byte[]> getProducer() {
        if (producer == null) {
            producer = new Producer(getProducerConfig());
        }
        return producer;
    }

    public static void send(String topic, byte[] dd) {
        Producer producer = getProducer();
        KeyedMessage message = new KeyedMessage(topic, dd);
        producer.send(message);
    }

    public static void send(String topic, String content)
    {
        if (content != null) {
            try {
                send(topic, content.getBytes("utf8"));
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        else
            logger.error("=======String is null !=========");
    }

    public static void send(String topic, JSONObject json)
    {
        send(topic, json.toString());
    }

    public static void recive(String groupid, String top, KafkaRecive hander)
    {
        logger.debug("===========start recive=========0");
        Properties props = getCustomerPro(groupid);
        ConsumerConnector consumer = Consumer.createJavaConsumerConnector(new ConsumerConfig(props));
        Map topicCountMap = new HashMap();
        topicCountMap.put(top, new Integer(1));
        Map consumerMap = consumer.createMessageStreams(topicCountMap);
        KafkaStream stream = (KafkaStream)((List)consumerMap.get(top)).get(0);
        ConsumerIterator it = stream.iterator();
        logger.debug("===========start recive=========1");

        while (it.hasNext()) {
            byte[] bf = (byte[])it.next().message();
            try
            {
                String request = new String(bf, "utf8");
                logger.debug(request);
                JSONObject jsonObj = new JSONObject(request);

                hander.handle(jsonObj);
            }
            catch (Exception e) {
                logger.debug(e.getMessage(), e);
            }
        }
    }

    public static void reciveByte(String groupid, String top, KafkaReciveBytes hander)
    {
        logger.debug("===========start recive=========0");
        Properties props = getCustomerPro(groupid);
        ConsumerConnector consumer = Consumer.createJavaConsumerConnector(new ConsumerConfig(props));
        Map topicCountMap = new HashMap();
        topicCountMap.put(top, new Integer(1));
        Map consumerMap = consumer.createMessageStreams(topicCountMap);
        KafkaStream stream = (KafkaStream)((List)consumerMap.get(top)).get(0);
        ConsumerIterator it = stream.iterator();
        logger.debug("===========start recive=========1");

        while (it.hasNext()) {
            byte[] bf = (byte[])it.next().message();
            try
            {
                hander.handle(bf);
            }
            catch (Exception e)
            {
                logger.debug(e.getMessage(), e);
            }
        }
    }
}
