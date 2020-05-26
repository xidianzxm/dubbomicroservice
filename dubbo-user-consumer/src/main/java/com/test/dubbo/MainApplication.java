package com.test.dubbo;

import com.test.dubbo.bean.Movie;
import com.test.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();
        UserService userService = applicationContext.getBean(UserService.class);

        //测试这次远程调用是否成功
        Movie newestMovie = userService.buyNewMovie();
        System.out.println(newestMovie);

        System.in.read();
    }
}
