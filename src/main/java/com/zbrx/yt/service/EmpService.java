package com.zbrx.yt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zbrx.yt.model.Emp_yt;

public interface EmpService {
	public List<Emp_yt> selectEmp();
}
