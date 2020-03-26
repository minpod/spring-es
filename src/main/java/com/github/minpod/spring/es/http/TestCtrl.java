package com.github.minpod.spring.es.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by mingle. Time 2020-03-26 16:53 Desc 文件描述
 */
@RestController
@RequestMapping("es")
public class TestCtrl {
    
    @RequestMapping("index")
    public String index() {
        return "hello spring es";
    }
}
