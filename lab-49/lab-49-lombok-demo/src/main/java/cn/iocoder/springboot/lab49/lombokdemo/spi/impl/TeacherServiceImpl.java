package cn.iocoder.springboot.lab49.lombokdemo.spi.impl;

import cn.iocoder.springboot.lab49.lombokdemo.spi.PersonService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhoujinji
 * @version 1.0
 * @date 2020/9/15 14:45
 */
@Slf4j
public class TeacherServiceImpl implements PersonService {
    @Override
    public void performTask() {
        log.info("教师执行!!!");
    }
}
