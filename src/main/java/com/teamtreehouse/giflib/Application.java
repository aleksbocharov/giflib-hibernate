package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application {
    // start db server java -cp h2-1.4.190.jar org.h2.tools.Server
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
