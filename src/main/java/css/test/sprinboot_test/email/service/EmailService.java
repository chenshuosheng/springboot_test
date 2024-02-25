package css.test.sprinboot_test.email.service;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 11:55
 */
public interface EmailService {

    /**
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    boolean send(String to, String title, String content);
}
