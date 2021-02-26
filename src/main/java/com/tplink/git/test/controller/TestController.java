package com.tplink.git.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nathan.wang
 * @description
 * @date 2021/2/26
 * @todo
 * @example
 */
@RestController
@RequestMapping(value = {"/test"})
public class TestController {

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello world!";
    }

}
