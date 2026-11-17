package com.klef.ms.service;

import java.util.List;
import com.klef.ms.entity.CharityEntity;

public interface CharityService {
	CharityEntity add(CharityEntity c);
	List<CharityEntity> getAll();
	CharityEntity getById(Long id);
	CharityEntity update(CharityEntity c);
	void delete(Long id);
}
