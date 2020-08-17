package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeptMapper;
import com.xiaoshu.dao.EmpMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Dept;
import com.xiaoshu.entity.Emp;
import com.xiaoshu.entity.EmpVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class EmpService {


	// 新增
	/*public void addUser(User t) throws Exception {
		userMapper.insert(t);
	};

	// 修改
	public void updateUser(User t) throws Exception {
		userMapper.updateByPrimaryKeySelective(t);
	};*/

	// 删除
	public void deleteEmp(Integer id) throws Exception {
		empMapper.deleteByPrimaryKey(id);
	};

	// 登录
	
	// 通过用户名判断是否存在，（新增时不能重名）
/*	public User existUserWithUserName(String userName) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};*/

	
	@Autowired
	private EmpMapper empMapper;

	@Autowired
	private DeptMapper deptMapper;
	

	public PageInfo<EmpVo> findEmpPage(EmpVo emp, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		//查询集合列表
		List<EmpVo> list=empMapper.findPage(emp);
		
		PageInfo<EmpVo> pageInfo = new PageInfo<EmpVo>(list);
		
		return pageInfo;
	}


	public List<Dept> findDeptList() {
		
		
		return deptMapper.selectAll();
	}


}
