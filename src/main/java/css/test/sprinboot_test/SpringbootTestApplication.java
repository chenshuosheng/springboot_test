package css.test.sprinboot_test;

import css.test.anno.EnableCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication//默认扫描所在包及子包
//用于启用配置属性绑定到 EmailProperties 类，与@ConfigurationProperties配合使用
//@EnableConfigurationProperties(value = EmailProperties.class)
//@Import(UseImportConfig.class)//手动注入
//@Import(CommonImportSelector.class)//手动注入
@EnableCommonConfig
public class SpringbootTestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootTestApplication.class, args);

        //System.out.println(context.getBean(Province.class));

        //error：No qualifying bean of type 'css.test.pojo.Country' available:
        // expected single matching bean but found 2: country,country2
        //System.out.println(context.getBean(Country.class));

        System.out.println(context.getBean("country"));
        //System.out.println(context.getBean("country2"));

        System.out.println(context.getBean("province2"));
        System.out.println(context.getBean("province"));
    }

}
