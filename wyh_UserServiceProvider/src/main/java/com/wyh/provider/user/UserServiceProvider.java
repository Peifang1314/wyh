package com.wyh.provider.user;

import com.wyh.common.restult.R;
import com.wyh.common.util.ResultUtil;
import com.wyh.domain.User;
import com.wyh.mapper.user.UserMapper;
import com.wyh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Mr.lsf
 * @create: 2018-09-05 00:18
 **/

@Service
public class UserServiceProvider implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public R save(User user) {
        return ResultUtil.creatResult(userMapper.insert(user));
    }
}
