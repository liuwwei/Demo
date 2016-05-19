package com.zbrx.yt.dao;

import java.util.List;

import com.zbrx.yt.model.Emp_yt;

public interface Emp_ytMapper {
    int insert(Emp_yt record);

    int insertSelective(Emp_yt record);
    
    List<Emp_yt> findAll();
}