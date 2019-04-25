package cn.ak47007.springbootdruid.controller;

import cn.ak47007.springbootdruid.config.DruidConfig;
import cn.ak47007.springbootdruid.entity.User;
import cn.ak47007.springbootdruid.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AK47007
 * @Date 4/24/2019 9:32 PM
 * @Description :
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        logger.info("findAll");
        return userService.findAll();
    }
}
