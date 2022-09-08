package cn.iocoder.springboot.lab49.lombokdemo;

import cn.iocoder.springboot.lab49.lombokdemo.spi.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@SpringBootApplication
public class LombokApplication {

    public static void main(String[] args) {
        ServiceLoader<PersonService> personServices = ServiceLoader.load(PersonService.class);
        for (PersonService personService :
                personServices) {
            personService.performTask();
        }
        // 启动 Spring Boot 应用
        SpringApplication.run(LombokApplication.class, args);
    }

}
