package com.yhs.springcloudkafka.util;

import org.json.JSONObject;

/**
 * @author Charles
 * @Title: BaseSms
 * @Package com.yhs.springcloudkafkaserver.util
 * @Description: TODO
 * @date 2017/12/22 15:57
 */
public class BaseSms {
    private String phone;
    private JSONObject content;
    private String sendtype;
    private String timetype;
    private String fromsystem;
    private String sendtime;
    private String template;
    private String msgtype;
    private int bid;
    private int obid;
    private String signName = null;

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JSONObject getContent() {
        return this.content;
    }

    public void setContent(JSONObject content) {
        this.content = content;
    }

    public String getSendtype() {
        return this.sendtype;
    }

    public void setSendtype(String sendtype) {
        this.sendtype = sendtype;
    }

    public String getTimetype() {
        return this.timetype;
    }

    public void setTimetype(String timetype) {
        this.timetype = timetype;
    }

    public String getFromsystem() {
        return this.fromsystem;
    }

    public void setFromsystem(String fromsystem) {
        this.fromsystem = fromsystem;
    }

    public String getSendtime() {
        return this.sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getMsgtype() {
        return this.msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getObid() {
        return this.obid;
    }

    public void setObid(int obid) {
        this.obid = obid;
    }

    public String getSignName() {
        return this.signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getJsonString() throws Exception
    {
        if (this.phone == null)
            throw new Exception("number is null");
        if (this.sendtype == null)
            throw new Exception("sendtype is null");
        if (this.fromsystem == null)
            throw new Exception("fromsystem is null");
        if (this.timetype == null)
            throw new Exception("timetype is null");
        if (this.msgtype == null) {
            throw new Exception("msgtype is null");
        }
        if ((this.sendtype.equals("sms")) && (this.content == null))
            throw new Exception("content is null");
        if ((this.sendtype.equals("sms")) && (this.template == null))
            throw new Exception("template is null");
        if ((this.timetype.equals("sometime")) && (this.sendtime == null)) {
            throw new Exception("sendtime is null");
        }
        if (this.signName == null)
        {
            throw new Exception("signName is null");
        }if (this.content == null) {
        this.content = new JSONObject();
    }

        StringBuffer sb = new StringBuffer();
        sb.append("{\"phone\":\"").append(this.phone).append("\",")
                .append(" \"sendtype\":\"")
                .append(this.sendtype).append("\",")
                .append(" \"fromsystem\":\"")
                .append(this.fromsystem).append("\",")
                .append(" \"msgtype\":\"")
                .append(this.msgtype).append("\",")
                .append(" \"timetype\":\"")
                .append(this.timetype).append("\",")
                .append(" \"template\":\"")
                .append(this.template).append("\",")
                .append(" \"sendtime\":\"")
                .append(this.sendtime).append("\",")
                .append(" \"bid\":")
                .append(this.bid).append(",")
                .append(" \"obid\":")
                .append(this.obid).append(",")
                .append(" \"content\":")
                .append(this.content.toString()).append(",")
                .append(" \"signName\":\"")
                .append(this.signName).append("\"}");
        return sb.toString();
    }

}
