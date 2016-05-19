package com.zbrx.yt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zbrx.yt.model.Emp_yt;
import com.zbrx.yt.service.EmpService;
/* ：：*/
@Controller
@RequestMapping("/emp")
public class Emp_ytController {
	@Resource(name="empService")
	private EmpService empService;

	@RequestMapping("/findAll.do")
	public String showEmp(ModelMap map) {
		List<Emp_yt> empyt = empService.selectEmp();
		map.addAttribute("list", empyt);
		System.out.println("------------" + empyt);
		return "/emp";
	}

}
