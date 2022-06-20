package com.itheima.dao;

import com.itheima.domain.Users;
import com.mysql.fabric.xmlrpc.base.Param;


import java.util.List;

public interface MybatisMapper {
     List<Users> selectAll();
       Users selectByid(String id);
    Users select(@Param("username") String username, @Param("password") String password);
}
