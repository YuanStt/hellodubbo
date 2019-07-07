package com.zys;

import com.zys.service.SayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        for (int i = 0; i < 50; i++) {
            SayService sayService = (SayService) context.getBean("sayService");
            String word = sayService.say("zs");
            System.out.println(word);
        }
    }

}
