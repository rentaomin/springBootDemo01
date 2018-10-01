# springBootDemo01

学习SpringBoot 入门案例

一、首先搭建最简单的SpringBoot Hello World!，要求JDK 1.8+

  1、创建maven项目，编写 pom.xml ,引入：
     <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.0.5.RELEASE</version>
        <relativePath/> 
    </parent>
    
  2、 创建一个SpringBoot 启动引导类 GirlApplication，该类一般位于项目的目录结构最顶层，此处为：com.example.girl，
其余具体业务代码在该目录结构下创建如：com.example.girl.entity ;com.example.girl.controller ...
    GirlApplication.java 类如下：
    package com.example.girl;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class GirlApplication {

        public static void main(String[] args) {
            SpringApplication.run(GirlApplication.class, args);
        }
    }


  3、配置 SpringBoot 的资源配置文件，可以为：application.yml 或 application.properties 文件，官方推荐为 application.yml，
  该文件默认为空，即采用springBoot 提供的默认配置。默认端口为：8080
  
  4、运行 GirlApplication.java ，执行main 方法，即可启动SpringBoot,日志如下：
  ...
  ...
  2018-10-01 13:07:09.824  INFO 23464 --- [           main] com.example.girl.GirlApplication         : Started GirlApplication in 3.171 seconds (JVM running for 3.85)
  
  如上表示启动成功，可通过浏览器访问：http://localhost:8080/  注意：此处访问时不需要加项目名称，否则会无法访问，可通过配置指定项目访问名称
  
    Whitelabel Error Page
    This application has no explicit mapping for /error, so you are seeing this as a fallback.

    Mon Oct 01 10:15:36 CST 2018
    There was an unexpected error (type=Internal Server Error, status=500).
    could not execute statement; SQL [n/a]; nested exception is org.hibernate.exception.DataException: could not execute statement
  
  看到如上表示，启动成功，此时没有编写请求和返回结果，所以没有内容
  
  5、若要想看到返回结果，进行测试，可通过编写 HelloWorldController.java 
  
  6、运行 GirlApplication.java  ,通过浏览器请求：http://localhost:8080/hello 进行访问，即可看到访问页面返回如下：
  
    Hello World SpringBoot !
    
   至此 springBoot Hello world 编写成功！
  
  
  
