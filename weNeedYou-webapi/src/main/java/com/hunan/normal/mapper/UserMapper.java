package com.hunan.normal.mapper;

import com.hunan.normal.mapper.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: WeNeedYou
 * @description: 账户相关
 * @author: machitao
 * @create: 2021-11-12 00:56
 **/
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<UserEntity> queryAll();

    /**
     * 查询某个用户
     * @param id
     * @return
     */
    UserEntity queryById(@Param("id") Integer id);

    /**
     * 插入数据
     * @param userEntity
     * @return
     */
    int insert(@Param("userEntity") UserEntity userEntity);

}
