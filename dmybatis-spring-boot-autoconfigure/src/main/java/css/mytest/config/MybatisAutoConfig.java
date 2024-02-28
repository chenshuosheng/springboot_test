package css.mytest.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description: 自定义mybatis自动配置类
 * @Author: CSS
 * @Date: 2024/2/27 21:49
 */

@AutoConfiguration
public class MybatisAutoConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        List<String> packages = AutoConfigurationPackages.get(beanFactory);
        String s = packages.get(0);

        //配置扫描包
        mapperScannerConfigurer.setBasePackage(s);

        //配置扫描注解
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);

        return mapperScannerConfigurer;
    }
}
