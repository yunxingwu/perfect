package com.perfect.star.springmvc.mail;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by  wuyunxing on   2016/6/28.
 */
@Data
public class MailBean implements Serializable{
    /**
     * 发送
     */
    private String from;
    /**
     * 发送人
     */
    private String fromName;
    /**
     * 收件人
     */
    private String[] toEmails;

    /**
     * 邮件标题
     */
    private String subject;

    private Map data ;          //邮件数据
    private String template;    //邮件模
}
