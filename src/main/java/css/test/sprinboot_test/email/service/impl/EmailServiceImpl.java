package css.test.sprinboot_test.email.service.impl;

import css.test.sprinboot_test.email.pojo.EmailProperties;
import css.test.sprinboot_test.email.service.EmailService;
import css.test.sprinboot_test.email.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 11:57
 */

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailProperties properties;         //使用自动注入

    /**
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    @Override
    public boolean send(String to, String title, String content) {
        //EmailProperties properties = new EmailProperties();   //手动生成的类，值无法注入，默认为null
        //发送邮件
        boolean flag = EmailUtil.sendEmail(properties,to, title, content);
        return flag;
    }
}
