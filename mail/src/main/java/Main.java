import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by  wuyunxing on   2016/4/12.
 */

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.exmail.sina.com"); // 指定SMTP服务器
        props.put("mail.smtp.auth", "true"); // 指定是否需要SMTP验证
        try {
            System.out.println("fff");
            Session mailSession = Session.getDefaultInstance(props);
            Message message = new MimeMessage(mailSession);
            message.setFrom(new InternetAddress("qqq")); // 发件人
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("wuyunxing@zucp.com.cn")); // 收件人
            message.setSubject("aaa"); // 邮件主题
            message.setText("bbb"); // 邮件内容
            message.saveChanges();
            Transport transport = mailSession.getTransport("smtp");
            System.out.println("ggg");
            transport.connect("wuyunxing@zucp.com.cn", "wyx15077285362");
            transport.sendMessage(message, message.getAllRecipients());
            System.out.println("send end");
            transport.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
