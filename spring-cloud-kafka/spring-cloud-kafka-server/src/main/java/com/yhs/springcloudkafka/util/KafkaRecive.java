package com.yhs.springcloudkafka.util;


import org.json.JSONObject;

/**
 * @author Charles
 * @Title: KafkaRecive
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:52
 */
public interface KafkaRecive {
    public abstract void handle(JSONObject paramJSONObject);
}
