package css.test.sprinboot_test;

import css.test.pojo.Country;
import css.test.pojo.Province;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//用于启用配置属性绑定到 EmailProperties 类，与@ConfigurationProperties配合使用
//@EnableConfigurationProperties(value = EmailProperties.class)
public class SpringbootTestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootTestApplication.class, args);

        System.out.println(context.getBean(Country.class));
        System.out.println(context.getBean(Province.class));
    }

}
