package cn.iocoder.springboot.lab54.eventdemo.controller;

import cn.iocoder.springboot.lab54.eventdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register(String username) {
        userService.register(username);
        logger.info("注册同步成功");
        return "success";
    }

}
