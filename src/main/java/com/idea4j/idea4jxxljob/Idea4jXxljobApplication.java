package com.idea4j.idea4jxxljob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Idea4jXxljobApplication {

    public static void main(String[] args) {
        SpringApplication.run(Idea4jXxljobApplication.class, args);
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
