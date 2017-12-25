package com.yhs.springcloudkafka.config;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Charles
 * @Title: VeDate
 * @Package com.yhs.springcloudkafka.config
 * @Description: TODO
 * @date 2017/12/25 17:37
 */
public class VeDate {

    /**
     * 获取现在时间
     *
     * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
     */
    public static String getNowDate() {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);
        return dateNowStr;
    }
    public static void main(String[] args){
        System.out.println(getNowDate());
    }
}
