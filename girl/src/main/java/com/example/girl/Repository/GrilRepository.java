/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GrilRepository
 * Author:   zombie
 * Date:     2018/9/30 13:45
 * Description: 查询女孩信息接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.girl.Repository;

import com.example.girl.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈Coding never to stop〉<br> 
 * 〈查询女孩信息接口〉
 *
 * @author zombie
 * @create 2018/9/30
 * @since 1.0.0
 */
public interface GrilRepository extends JpaRepository<Girl,Integer> {


    Girl findGirlByName(String name);
}
