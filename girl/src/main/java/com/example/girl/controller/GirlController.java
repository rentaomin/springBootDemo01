/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GirlController
 * Author:   Dell
 * Date:     2018/9/30 13:39
 * Description: 女孩controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.controller;

import com.example.girl.service.GirlService;
import com.example.girl.Repository.GrilRepository;
import com.example.girl.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * 〈Coding never to stop〉<br> 
 * 〈女孩controller〉
 *
 * @author zombie
 * @create 2018/9/30
 * @since 1.0.0
 */
@RestController
public class GirlController {

    @Autowired
    private GrilRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 通过主键查询女生
     * @param id
     * @return
     */
    @GetMapping(value="/findGirlById")
    public Girl findGirlById(@RequestParam("id") Integer id){

        Optional<Girl> girl = girlRepository.findById(id);
        return girl.get();
    }

    /**
     * 查询所有女生信息
     * @return
     */
    @GetMapping(value="/findAll")
    public List<Girl> findAll(){
       return girlRepository.findAll();
    }

    /**
     * 通过name 查询女生信息
     * @param name
     * @return
     */
    @GetMapping(value="/findGirlByNamge")
    public Girl findGirlByNamge(@RequestParam("name") String name){
        return girlRepository.findGirlByName(name);
    }

    /**
     * 添加女生
     * @param name
     * @param age
     * @return
     */
    @GetMapping(value="/add")
    public String add(@RequestParam("name") String name,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        Girl save = girlRepository.save(girl);

        return  "id为："+save.getName()+" 女孩添加成功！";
    }

    /**
     * 通过主键删除女生信息
     * @param id
     * @return
     */
    @GetMapping(value="/delete")
    public String delete(@RequestParam("id") Integer id){
        girlRepository.deleteById(id);
        return  "id为："+id+" 女孩删除成功！";
    }

    /**
     * 保存两个女孩信息，用于测试事务
     * @return
     */
    @GetMapping("/saveTwoGirls")
    public String saveTwoGirls(){
        girlService.insertTwo();
        return "success";
    }

}
