/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   Dell
 * Date:     2018/9/29 13:36
 * Description: 用户操作控制层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.controller;

import com.example.girl.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈Coding never to stop〉<br> 
 * 〈用户操作控制层〉
 *
 * @author zombie
 * @create 2018/9/29
 * @since 1.0.0
 */

@RestController
public class UserController {

    // 获取yml 中配置的变量name 的值,该 name 变量名称可以自定义，但是value中的值必须与yml中配置的一样
    @Value("${name}")
    private String name;


    // 该参数的类型 可在此处声明
    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String  content;

   @Autowired
    private Person person;

    @GetMapping(value = "say")
    public String sayHello(){
        System.out.print("访问请求！");
        return "hello world!";
    }

    @GetMapping(value = "get")
    public Integer testValue(){
        System.out.print("请求成功！");
        return age;
    }


    @GetMapping(value = "getInfo")
    public String  getValue(){
        System.out.print("请求成功2！");
        return person.getName();
    }
}
