package com.test.dubbo;

import org.apache.jute.CsvOutputArchive;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("容器启动......");
        applicationContext.start();
        System.in.read();//按任意键退出
    }

}
