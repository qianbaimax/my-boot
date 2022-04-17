package com.atguigu.boot01helloworld.config;

import ch.qos.logback.core.hook.DelayingShutdownHook;
import com.atguigu.boot01helloworld.bean.Car;
import com.atguigu.boot01helloworld.bean.Pet;
import com.atguigu.boot01helloworld.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1. 配置类里使用@Bean标注在方法上，给容器注册组件，默认也是单实例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods ：代理bean的方法
 * Full(proxyBeanMethods = true)
 * Lite(proxyBeanMethods = false)
 * <p>
 * 4. @Import({User.class, ShutdownHookBase.class}):
 * 给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 *
 * @author chenlong
 * @since 2022/4/4 17:53
 */
@Import({User.class, DelayingShutdownHook.class})
@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)
// 1. 开启Car的配置绑定功能
// 2. 把Car这个组件注册到容器中
public class MyConfig {

    @ConditionalOnBean(name = "tom")
    @Bean // 给容器中添加组件。以方法名作为组件id，返回类型就是组件类型，返回值就是组件在容器中的示例。
    public User user01() {
        return new User("张三", 18);
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat",99.99);
    }

}
