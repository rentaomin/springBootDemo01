/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TemplateController
 * Author:   Dell
 * Date:     2018/9/30 12:29
 * Description: 测试注解控制层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈Coding never to stop〉<br> 
 * 〈测试注解控制层〉
 *
 * @author zombie
 * @create 2018/9/30
 * @since 1.0.0
 */

@RestController
public class TemplateController {


    /**
     * 测试 返回页面模板
     * @return
     */
    @RequestMapping(value = {"/sayHello","sayHi"})
    public String say() {

        return "index";
    }

    /**
     *  访问：http://localhost:8080/girl/getParam/33
     * @param id
     * @return
     */
    @RequestMapping(value = "getParam/{id}")
    public Integer getParam(@PathVariable("id") Integer id) {

        return id;
    }

    /**
     * 访问如下:http://localhost:8080/girl/getParam2?id=33
     * @param id
     * @return
     */
    @RequestMapping(value = "getParam2")
    public Integer getParam2(@RequestParam(value = "id",defaultValue = "0",required = false) Integer id) {

        return id;
    }
}
