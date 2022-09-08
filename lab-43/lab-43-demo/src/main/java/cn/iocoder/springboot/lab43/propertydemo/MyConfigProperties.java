package cn.iocoder.springboot.lab43.propertydemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zhoujinji
 * @version 1.0
 * @date 2020/9/19 18:39
 */
@Component
@ConfigurationProperties(prefix = "hello")
public class MyConfigProperties {
    public Integer getBoy() {
        return boy;
    }

    public void setBoy(Integer boy) {
        this.boy = boy;
    }

    public Integer getGirl() {
        return girl;
    }

    public void setGirl(Integer girl) {
        this.girl = girl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer boy;


    private Integer girl;

    private String name;
}
