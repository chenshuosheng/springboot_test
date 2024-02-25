package css.test.sprinboot_test.mybatis_test.controller;

import css.test.sprinboot_test.mybatis_test.pojo.User;
import css.test.sprinboot_test.mybatis_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/2/25 21:08
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public List<User> list(){
        return userService.list();
    }
}
