package css.test.sprinboot_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//用于启用配置属性绑定到 EmailProperties 类，与@ConfigurationProperties配合使用
//@EnableConfigurationProperties(value = EmailProperties.class)
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
