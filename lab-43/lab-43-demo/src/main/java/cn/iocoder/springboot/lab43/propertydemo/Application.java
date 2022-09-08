package cn.iocoder.springboot.lab43.propertydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Component
    public class OrderPropertiesCommandLineRunner implements CommandLineRunner {

        private final Logger logger = LoggerFactory.getLogger(getClass());

        @Autowired
        private OrderProperties orderProperties;

        @Autowired
        private MyConfigProperties myConfigProperties;

        @Override
        public void run(String... args) {
            logger.info("payTimeoutSeconds:" + orderProperties.getPayTimeoutSeconds());
            logger.info("createFrequencySeconds:" + orderProperties.getCreateFrequencySeconds());
            logger.info("boy+" + myConfigProperties.getBoy());


            for (Field field:myConfigProperties.getClass().getDeclaredFields()
                 ) {
                logger.info(field.getName() + "===" + field.getType() + "===" );
            }
        }

    }

    @Component
    public class ValueCommandLineRunner implements CommandLineRunner {

        private final Logger logger = LoggerFactory.getLogger(getClass());

        @Value("${order.pay-timeout-seconds}")
        private Integer payTimeoutSeconds;

        @Value("${order.create-frequency-seconds}")
        private Integer createFrequencySeconds;

//        @Value("${order.desc}")
//        private String desc;

        @Override
        public void run(String... args) {
            logger.info("payTimeoutSeconds:" + payTimeoutSeconds);
            logger.info("createFrequencySeconds:" + createFrequencySeconds);
        }

    }

}
