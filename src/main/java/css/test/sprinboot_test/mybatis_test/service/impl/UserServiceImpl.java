package css.test.sprinboot_test.mybatis_test.service.impl;

import css.test.sprinboot_test.mybatis_test.mapper.UserMapper;
import css.test.sprinboot_test.mybatis_test.pojo.User;
import css.test.sprinboot_test.mybatis_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 21:09
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
