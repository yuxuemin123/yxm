package com.xiaoshu.dao;

import java.util.List;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Stu;

public interface StuMapper extends BaseMapper<Stu>{

	List<Stu> findStuAll();
	
}
