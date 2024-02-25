package css.test.sprinboot_test.mybatis_test.mapper;

import css.test.sprinboot_test.mybatis_test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 21:09
 */

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> list();
}
