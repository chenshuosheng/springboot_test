package css.test.sprinboot_test.beanRegister.config;

import css.test.pojo.Country;
import css.test.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
    //@Bean
    //public Country country(@Value("${country.name:}") String name, @Value("${country.system:}") String system){
    //    return new Country(name,system);
    //}

    @Bean
    public Country country(@Value("${country.name:}") String name, @Value("${country.system:}") String system){
        return new Country(name,system);
    }

    //若不添加下列注解，当配置文件中不存在相应配置时会报错
    //Could not resolve placeholder 'country.name' in value "${country.name}"
    //当相应属性配置不存在时，bean对象不会注入
    @ConditionalOnProperty(prefix = "country",name = {"name","system"})
    @Bean("country2")
    public Country country_2(@Value("${country.name}") String name, @Value("${country.system}") String system){
        return new Country(name,system);
    }

    //当相应bean对象不存在时，注入province bean对象
    @ConditionalOnMissingBean(name = "country2")
    @Bean
    public Province province(){
        return new Province();
    }
}
