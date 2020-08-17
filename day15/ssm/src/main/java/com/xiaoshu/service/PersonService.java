package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.PersonMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Person;
import com.xiaoshu.entity.PersonExample;
import com.xiaoshu.entity.PersonExample.Criteria;

@Service
public class PersonService {

	//@Autowired
	//UserMapper userMapper;

	// 查询所有
	



	@Autowired
	private PersonMapper personMapper;

	

	// 新增
	/*public void addUser(User t) throws Exception {
		userMapper.insert(t);
	};

	// 修改
	public void updateUser(User t) throws Exception {
		userMapper.updateByPrimaryKeySelective(t);
	};*/

	//删除
	public void deleteUser(Integer id) throws Exception {
		personMapper.deleteByPrimaryKey(id);
	};

	
	

	// 通过用户名判断是否存在，（新增时不能重名）
	/*public User existUserWithUserName(String userName) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};*/



	
	public PageInfo<Person> findUserPage(Person person, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		//创建example对象封装参数
		PersonExample example = new PersonExample();
		Criteria cCriteria = example.createCriteria();
		//根据用户名模糊查询
		if(person.getPname()!=null) {
			
			cCriteria.andPnameLike("%"+person.getPname()+"%");	
		}
		
		List<Person> list = personMapper.selectByExample(example);
		PageInfo<Person> pageInfo = new PageInfo<Person>(list);
		return pageInfo;
	}


}
