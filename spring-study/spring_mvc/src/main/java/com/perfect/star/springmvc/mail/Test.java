package com.perfect.star.springmvc.mail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by  wuyunxing on   2016/6/28.
 */

public class Test {


      static   ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-mail.xml");


//    @Resource
//    private MailUtil mailUtil;

    public void testSendMail() {
//        MailUtil mailUtil = new MailUtil();
        MailUtil mailUtil = (MailUtil)applicationContext.getBean("mailUtil");

        String mailTemplatText ="<table style=\"font-size: 13px;color: #515151;font-family:'Microsoft YaHei';\">\n" +
                "        <tr>\n" +
                "            <td>亲爱的${userName}，</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>您距离成功注册翼支付只差一步了。</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td><a href='http://www.baidu.com' target=\"_blank\" style=\"display: inline-block;font-size: 14px;color: #FFF;border: 1px solid #D66500;background-color: #F57403;font-weight: bold;line-height: 32px;height: 32px;padding: 0px 20px;cursor: pointer;\" >继续</a></td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>\n" +
                "                如果点击无效，请复制下方网页地址到浏览器地址栏中打开：<br>\n" +
                "                链接：<a href='${url}' style=\"color: #08C;\">${url}</a>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>\n" +
                "                <p  style='margin-top:50px;color:#999999;'>为什么我会收到这封邮件？</p>\n" +
                "                <p  style='color:#999999;'>您在注册翼支付企业账户时，填写了此电子邮箱作为账户名，我们发送这封邮件，以确认您的确是邮箱的主人。\n" +
                "                    如果您没有注册翼支付企业账户，请忽略此邮件。可能是有人在注册时填错了自己的邮箱。\n" +
                "                    此为系统邮件，请勿回复  Copyright 翼支付 2011-2015 All Right Reserved\n" +
                "                </p>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </table>";


        System.out.println("邮件发送开始");
        //创建邮件
        MailBean mailBean = new MailBean();
        mailBean.setFrom("wuyunxing@zucp.com.cn");//指定了邮件发送人
        mailBean.setFromName("wuyunxing");
        mailBean.setSubject("测试邮件发送");
        mailBean.setToEmails(new String[]{"wuyunxing-it@bestpay.com.cn"});
        mailBean.setTemplate(mailTemplatText);
        Map map = new HashMap();
        map.put("userName", "abc");
        //邮件中发送超链接时一定要完整格式才能生效
        map.put("url", "https://b.bestpay.com.cn'");
        mailBean.setData(map);

        //发送邮件
        try {
            mailUtil.send(mailBean);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println("邮件发送结束");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testSendMail();
    }
}
