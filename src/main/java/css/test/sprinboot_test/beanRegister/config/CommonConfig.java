package css.test.sprinboot_test.beanRegister.config;

import css.test.pojo.Province;
import css.test.pojo.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 22:38
 */

@Configuration
public class CommonConfig {

    //将方法返回值交给IOC容器管理，成为IOC容器的bean对象
    //对象默认的名字：方法名
    @Bean
    public Country country(){
        return new Country();
    }

    @Bean("country2")
    public Country country_2(){
        return new Country();
    }

    @Bean
    public Province province(){
        return new Province();
    }
}
