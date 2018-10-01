/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Person
 * Author:   Dell
 * Date:     2018/9/29 13:58
 * Description: yml文件中配置的对象参数类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈Coding never to stop〉<br> 
 * 〈yml文件中配置的对象参数类〉
 *
 * @author zombie
 * @create 2018/9/29
 * @since 1.0.0
 */

// 声明为bean
@Component
// 获取yml配置文件中，前缀为person的配置
@ConfigurationProperties(prefix="person")
public class Person {

    private  String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
