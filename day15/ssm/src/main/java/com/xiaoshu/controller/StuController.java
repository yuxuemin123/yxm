package com.xiaoshu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaoshu.entity.Operation;
import com.xiaoshu.entity.Role;
import com.xiaoshu.entity.Stu;
import com.xiaoshu.entity.Tbstuday;
import com.xiaoshu.service.OperationService;
import com.xiaoshu.service.RoleService;
import com.xiaoshu.service.StuService;

@Controller
@RequestMapping("tbstuday")
public class StuController {
	
	static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private StuService ss;
	
	
	@Autowired
	private RoleService roleService ;
	
	@Autowired
	private OperationService operationService;
	
	@RequestMapping("tbstuday")
	public String index(HttpServletRequest request) throws Exception{
		
		
		
		
		return "tbstuday";
	}
	

}
