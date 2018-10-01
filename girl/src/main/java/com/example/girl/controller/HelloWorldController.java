/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloWorldController
 * Author:   Dell
 * Date:     2018/10/1 13:14
 * Description: 测试springBoot 项目启动成功
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈Coding never to stop〉<br> 
 * 〈测试springBoot 项目启动成功〉
 *
 * @author zombie
 * @create 2018/10/1
 * @since 1.0.0
 */
@RestController
public class HelloWorldController {
    /**
     * 启动测试spring boot 项目是否成功！
     * @return
     */
    @RequestMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World SpringBoot !";
    }
}
