/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GirlService
 * Author:   Dell
 * Date:     2018/10/1 8:38
 * Description: 女孩业务层‘’
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.service;

import com.example.girl.Repository.GrilRepository;
import com.example.girl.entity.Girl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈Coding never to stop〉<br> 
 * 〈女孩业务层‘’〉
 *
 * @author zombie
 * @create 2018/10/1
 * @since 1.0.0
 */
@Service
public class GirlService {


    private final static Logger logger = LoggerFactory.getLogger(GirlService.class);

    @Autowired
    private GrilRepository girlRepository;


    /**
     *  该方法用于测试 事务管理，故下面第二条数据name名称过长，会报错，若事务成功则全部保存，否则全部不保存
     *
     * @Transactional 注解为:org.springframework.transaction.annotation.Transactional
     *
     */
    @Transactional
    public void  insertTwo(){
        Girl girl1 = new Girl();
        girl1.setAge(44);
        girl1.setName("测试444");
        girlRepository.save(girl1);
        logger.info("保存女孩1成功！");

        Girl girl2 = new Girl();
        girl2.setName("测试");
        girl2.setAge(55 );
        girlRepository.save(girl2);
        logger.info("保存女孩2成功！");

    }
}
