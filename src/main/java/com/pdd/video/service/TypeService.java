package com.pdd.video.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pdd.video.bean.SubType;

@Service
public interface TypeService {
	List<SubType> getSubType(String mainType);
}
