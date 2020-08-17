package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.SchoolMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.SchoolVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class SchoolService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	private SchoolMapper schoolMapper;
	

	// 新增
	/*public void addUser(User t) throws Exception {
		userMapper.insert(t);
	};

	// 修改
	public void updateUser(User t) throws Exception {
		userMapper.updateByPrimaryKeySelective(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		userMapper.deleteByPrimaryKey(id);
	};*/

	// 登录
	

	// 通过用户名判断是否存在，（新增时不能重名）
	/*public User existUserWithUserName(String userName) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};*/

	// 通过角色判断是否存在
	/*public User existUserWithRoleId(Integer roleId) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(roleId);
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	}*/

	


	public PageInfo<SchoolVo> findSchoolPage(SchoolVo school, Integer pageNum, Integer pageSize) {
      PageHelper.startPage(pageNum, pageSize);
		
		List<SchoolVo> list =schoolMapper.findPage(school);
		
		PageInfo<SchoolVo> pageInfo = new PageInfo<SchoolVo>(list);
		return pageInfo;
	}


}
