package com.rainhowchan.zjh.service.impl;

import com.rainhowchan.zjh.mapper.DeptMapper;
import com.rainhowchan.zjh.po.Dept;
import com.rainhowchan.zjh.service.RegisterUser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by RainhowChan on 2017/9/26.
 */
@Service
public class RegisterUserImpl implements RegisterUser {

    @Resource
    @Qualifier("deptMapper")
    private DeptMapper mapper;
    public int addUser(Dept dept) {
        System.out.println(dept);
        return mapper.insert(dept);
    }
}
