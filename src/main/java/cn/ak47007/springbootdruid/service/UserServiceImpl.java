package cn.ak47007.springbootdruid.service;

import cn.ak47007.springbootdruid.entity.User;
import cn.ak47007.springbootdruid.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author AK47007
 * @Date 4/25/2019 8:49 AM
 * @Description :
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
