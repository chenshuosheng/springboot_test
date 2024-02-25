package css.test.sprinboot_test.email.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 11:59
 */

@Data
@Configuration //包含@Component
//@Component，当未在主启动类添加注解@EnableConfigurationProperties(value = EmailProperties.class)时，需添加该注解
//通过@ConfigurationProperties注解读取配置文件并自动注入属性值，将该类交给Spring容器管理
@ConfigurationProperties(prefix = "email")
public class EmailProperties {

    private String user;

    private String code;

    private String host;

    private Boolean auth;
}
