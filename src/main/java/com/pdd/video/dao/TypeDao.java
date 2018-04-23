package com.pdd.video.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdd.video.bean.SubType;

public interface TypeDao {
	List<SubType> getSubType(@Param("mainType")String mainType);
}
