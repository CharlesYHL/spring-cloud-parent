package com.yhs.springcloudkafkaserver.util;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Charles
 * @Title: KafkaPropertiesUtil
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:34
 */
@Component
public class KafkaPropertiesUtil {
    private static String kafkaZookeeperConnect = null;
    private static String kafkaGroupId = null;
    private static String kafkaBrokerList = null;

    public static synchronized void loads()
    {
        InputStream is = KafkaPropertiesUtil.class.getResourceAsStream("/kafka.properties");
        Properties iotproperties = new Properties();
        try {
            iotproperties.load(is);
            kafkaZookeeperConnect = iotproperties.getProperty("kafka.zookeeper.connect").toString();
            kafkaGroupId = iotproperties.getProperty("kafka.group.id").toString();
            kafkaBrokerList = iotproperties.getProperty("kafka.metadata.broker.list").toString();
        }
        catch (Exception e) {
            System.err.println("不能读取属性文件. 请确保kafka.properties在CLASSPATH指定的路径中");
        }
    }

    public static String getKafkaZookeeperConnect()
    {
        return kafkaZookeeperConnect;
    }

    public static String getKafkaGroupId() {
        return kafkaGroupId;
    }

    public static String getKafkaBrokerList() {
        if (kafkaBrokerList == null)
            loads();
        return kafkaBrokerList;
    }

    static
    {
        loads();
    }
}
