package css.test.sprinboot_test.email.controller;

import css.test.sprinboot_test.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 11:53
 */

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")
    public String send() {
        //收件人信箱
        String to = "1363318229@qq.com";
        //邮件标题
        String title = "测试邮件";
        //邮件正文
        String content = "我是即将年薪百万的打工仔......";
        //发送邮件
        boolean flag = emailService.send(to, title, content);
        return flag ? "发送成功！" : "发送失败！";
    }
}
