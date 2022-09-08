package cn.iocoder.springboot.lab51.sentrydemo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Zhoujinji
 * @version 1.0
 * @date 2020/9/18 16:25
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private  ApplicationContext applicationContext;

    @Override

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    /**
     * 获取applicationContext
     * @return
     */
    public  ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

    /**
     * 通过name获取 Bean.
     * @param name
     * @return
     */
    public  Object getBean(String name){
        return this.getApplicationContext().getBean(name);
    }

    /**
     * 通过class获取Bean.
     * @param clazz
     * @param <T>
     * @return
     */
    public  <T> T getBean(Class<T> clazz){
        return this.getApplicationContext().getBean(clazz);
    }

    /**
     * 通过name,以及Clazz返回指定的Bean
     * @param name
     * @param clazz
     * @param <T>
     * @return
     */
    public  <T> T getBean(String name,Class<T> clazz){
        return this.getApplicationContext().getBean(name, clazz);
    }

}
