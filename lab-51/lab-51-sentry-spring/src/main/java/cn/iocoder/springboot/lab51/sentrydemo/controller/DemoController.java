package cn.iocoder.springboot.lab51.sentrydemo.controller;

import cn.iocoder.springboot.lab51.sentrydemo.util.SpringContextUtil;
import io.sentry.SentryClient;
import io.sentry.event.EventBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class DemoController {

    @Autowired
    private SentryClient sentryClient;

    @Autowired
    private SpringContextUtil springContextUtil;

    @Autowired
    private ApplicationContext applicationContext;



    @GetMapping("/sentry")
    public String sentry() {
        // 上传消息到 Sentry 中
        sentryClient.sendMessage("示例消息");

        // 上传异常到 Sentry 中
        sentryClient.sendException(new RuntimeException("测试异常"));

        // 上传事件到 Sentry 中
        sentryClient.sendEvent(new EventBuilder().withMessage("示例事件").build());

        System.out.println(springContextUtil.getApplicationContext().getBeanDefinitionNames() + "    zjj");

        System.out.println(applicationContext.getBeanDefinitionNames() + "--" + applicationContext.getBeanDefinitionCount());

        return "success";
    }

    @GetMapping("/exception")
    public String exception() {
        throw new RuntimeException("直接抛出异常");
    }

}
