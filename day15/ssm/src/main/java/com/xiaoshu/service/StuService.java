package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshu.dao.StuMapper;
import com.xiaoshu.entity.Stu;

@Service
public class StuService {

	
	@Autowired
	private StuMapper sm;
	
	public List<Stu> findStuAll() {
		return sm.findStuAll();
	}
	
}
