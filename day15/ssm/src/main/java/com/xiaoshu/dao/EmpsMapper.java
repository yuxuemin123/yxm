package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Emps;
import com.xiaoshu.entity.EmpsExample;
import com.xiaoshu.entity.EmpsVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpsMapper extends BaseMapper<Emps> {
    long countByExample(EmpsExample example);

    int deleteByExample(EmpsExample example);

    List<Emps> selectByExample(EmpsExample example);

    int updateByExampleSelective(@Param("record") Emps record, @Param("example") EmpsExample example);

    int updateByExample(@Param("record") Emps record, @Param("example") EmpsExample example);

	List<EmpsVo> findPage(EmpsVo emps);
	
}