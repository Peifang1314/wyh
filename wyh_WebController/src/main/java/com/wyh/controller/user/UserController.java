package com.wyh.controller.user;

import com.wyh.common.restult.R;
import com.wyh.domain.User;
import com.wyh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Mr.lsf
 * @create: 2018-09-05 16:58
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //新增用户
    @PostMapping("usersave.do")
    public R save(User user){
        return userService.save(user);
    }

}
