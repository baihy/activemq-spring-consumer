package com.baihy.main;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.main
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 18:13
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:application-mail.xml");
        applicationContext.start();
        System.out.println("容器已启动。。。");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
