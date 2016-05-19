package com.zbrx.yt.service;

import java.util.List;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zbrx.yt.dao.Emp_ytMapper;
import com.zbrx.yt.model.Emp_yt;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Resource
	private Emp_ytMapper emp_ytDao;

	public List<Emp_yt> selectEmp() {
		List<Emp_yt> list = emp_ytDao.findAll();
		return list;
	}
}
