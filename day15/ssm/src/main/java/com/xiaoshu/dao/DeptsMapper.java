package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Depts;
import com.xiaoshu.entity.DeptsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptsMapper extends BaseMapper<Depts> {
    long countByExample(DeptsExample example);

    int deleteByExample(DeptsExample example);

    List<Depts> selectByExample(DeptsExample example);

    int updateByExampleSelective(@Param("record") Depts record, @Param("example") DeptsExample example);

    int updateByExample(@Param("record") Depts record, @Param("example") DeptsExample example);
}