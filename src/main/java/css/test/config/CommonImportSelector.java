package css.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 当一个 @Configuration 注解的类使用了 @Import 注解导入了 CommonImportSelector 类时，
 * Spring 在初始化这个配置类时会调用 CommonImportSelector 类的 selectImports 方法。
 * 在 selectImports 方法中，根据需要动态地返回需要导入的其他配置类的全限定类名，
 * Spring 会自动将这些配置类也加载到应用上下文中。
 * @Author: CSS
 * @Date: 2024/2/26 16:52
 */

@Configuration
public class CommonImportSelector implements ImportSelector {
    //@Override
    //public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //    return new String[]{"css.test.UseImportConfig"};
    //}

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        List<String> classes = new ArrayList<>();

        //读取配置文件的内容
        InputStream is = CommonImportSelector.class.getClassLoader().getResourceAsStream("common.import");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                classes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return classes.toArray(new String[0]);
    }
}
