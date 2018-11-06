package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})不启用数据源*/
/*@EnableCaching*/
public class MySpringBootDemo {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootDemo.class,args);
    }
}
