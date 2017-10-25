package com.prac.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vishal Maurya on 25/10/17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
      return "index";
    }
}
