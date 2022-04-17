package com.atguigu.boot01helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @SpringBootApplication：这是一个springboot应用
 */
@EnableRetry
@SpringBootApplication
public class Boot01HelloworldApplication {

    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Boot01HelloworldApplication.class, args);
        // 查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println(beanNamesForType.length);

        // 从容器中获取组件
//        Pet tom1 = run.getBean("tom", Pet.class);
//        Pet tom2 = run.getBean("tom", Pet.class);
//        System.out.println(tom1 == tom2);
//        // com.atguigu.boot01helloworld.config.MyConfig$$EnhancerBySpringCGLIB$$8c3ea11c@501f07cf
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//        // 如果@Configuration(proxyBeanMethods = true)代理对象调用的方法，springboot总会检查这个组件在容器中是否存在
//        // 保持组件单实例
//        // 如果@Configuration(proxyBeanMethods = false)，com.atguigu.boot01helloworld.config.MyConfig@7bcf9e15
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println(user == user1);
//
//        // 5. 获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("+================");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        ShutdownHookBase bean1 = run.getBean(ShutdownHookBase.class);
//        System.out.println(bean1);
//        boolean tom = run.containsBean("tom");
//        System.out.println(tom);
//        boolean user01 = run.containsBean("user01");
//        System.out.println(user01);


    }

}
