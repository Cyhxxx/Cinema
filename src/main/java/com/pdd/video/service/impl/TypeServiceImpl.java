package com.pdd.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdd.video.bean.SubType;
import com.pdd.video.dao.TypeDao;
import com.pdd.video.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeDao td;
	
	@Override
	public List<SubType> getSubType(String mainType) {
		return td.getSubType(mainType);
	}
}
