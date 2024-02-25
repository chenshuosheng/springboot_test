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

    @Bean
    public Country country(){
        return new Country();
    }

    @Bean
    public Province province(){
        return new Province();
    }
}
