package css.test;

import css.test.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/26 16:45
 */

@Configuration
public class UseImportConfig {

    @Bean
    public Province province2(){
        return new Province();
    }
}
