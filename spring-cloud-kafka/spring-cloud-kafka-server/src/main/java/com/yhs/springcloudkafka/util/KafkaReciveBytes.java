package com.yhs.springcloudkafka.util;

/**
 * @author Charles
 * @Title: KafkaReciveBytes
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:54
 */
public interface KafkaReciveBytes {
    public abstract void handle(byte[] paramArrayOfByte);
}
