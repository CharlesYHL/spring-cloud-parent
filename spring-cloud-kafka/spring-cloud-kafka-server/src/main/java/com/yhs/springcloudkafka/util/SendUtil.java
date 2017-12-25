package com.yhs.springcloudkafka.util;

import org.json.JSONObject;

/**
 * @author Charles
 * @Title: SendUtil
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:56
 */
public class SendUtil {
    public static void send(SendMsg sendMsg)
            throws Exception
    {
        String jon = sendMsg.getJsonString();
        System.out.println("----SmsUtil send--jon------" + jon);

        byte[] bf = jon.getBytes("utf8");
        KafkaUtil.send("shuaige", bf);
    }

    public static void main(String[] sms_Msg) throws Exception
    {
        System.out.println(" SmsMsg smsMsg = new SmsMsg();\n        smsMsg.setContent(new String[]{\"百联广场\", \"二楼\"});\n        smsMsg.setFromsystem(\"iot_server\");\n        smsMsg.setNumber(\"13120622886\");\n        smsMsg.setSendtype(\"sms_phon\");\n        smsMsg.setTimetype(\"now\");\n        smsMsg.setTemplate(\"1136353\");\n        SmsUtil.send(smsMsg);");

        SendMsg smsMsg = new SendMsg();

        JSONObject content = new JSONObject();
        content.put("xjl","精灵");

        smsMsg.setFromsystem("iot_server");
        smsMsg.setPhone("13628690854");
        smsMsg.setSendtype("sms");
        smsMsg.setTimetype("now");
        smsMsg.setTemplate("SMS_12987549");
        smsMsg.setMsgtype("fault");
        smsMsg.setContent(content);
        smsMsg.setSignName("消防小精灵");
        send(smsMsg);
    }
}
