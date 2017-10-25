package com.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vishal Maurya on 25/10/17.
 */
@SpringBootApplication
public class Application {
  public static void main(String ...args) {
    SpringApplication.run(Application.class,args);
  }
}