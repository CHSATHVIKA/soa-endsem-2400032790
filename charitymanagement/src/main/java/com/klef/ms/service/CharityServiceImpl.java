package com.klef.ms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.ms.entity.CharityEntity;
import com.klef.ms.repository.CharityRepository;

@Service
public class CharityServiceImpl implements CharityService {
	@Autowired
	private CharityRepository repo;

	public CharityEntity add(CharityEntity c) { return repo.save(c); }
	public List<CharityEntity> getAll() { return repo.findAll(); }
	public CharityEntity getById(Long id) { return repo.findById(id).orElse(null); }
	public CharityEntity update(CharityEntity c) { return repo.save(c); }
	public void delete(Long id) { repo.deleteById(id); }
}
