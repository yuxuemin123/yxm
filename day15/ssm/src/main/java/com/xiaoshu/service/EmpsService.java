package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeptsMapper;
import com.xiaoshu.dao.EmpsMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Depts;
import com.xiaoshu.entity.Emps;
import com.xiaoshu.entity.EmpsExample;
import com.xiaoshu.entity.EmpsExample.Criterion;
import com.xiaoshu.entity.EmpsVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class EmpsService {

	

	@Autowired
     private EmpsMapper empsMapper;

	@Autowired
	private DeptsMapper deptsMapper;
	
	
	// 新增
	public void addEmps(Emps t) throws Exception {
		empsMapper.insert(t);
	};

	// 修改
	//public void updateUser(User t) throws Exception {
		//userMapper.updateByPrimaryKeySelective(t);
	//};

	// 删除
	public void deleteEmps(Integer id) throws Exception {
		empsMapper.deleteByPrimaryKey(id);
	};

	// 登录
	

	// 通过用户名判断是否存在，（新增时不能重名）
	public Emps existUserWithUserName(String userName) throws Exception {
		EmpsExample example = new EmpsExample();
	com.xiaoshu.entity.EmpsExample.Criteria criteria = example.createCriteria();
		criteria.andEnameEqualTo(userName);
		List<Emps> userList = empsMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};

	// 通过角色判断是否存在
	

	public PageInfo<EmpsVo> findEmpsPage(EmpsVo emps, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		//查询列表
		List<EmpsVo> list=empsMapper.findPage(emps);
		PageInfo<EmpsVo> pageInfo = new PageInfo<EmpsVo>(list);
		return pageInfo;
	}



	public List<Depts> findDeptList() {
		// TODO Auto-generated method stub
		
		return deptsMapper.selectAll();
	}


}
