package com.klef.ms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.ms.entity.CharityEntity;
import com.klef.ms.service.CharityService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Charity Fund", description = "Charity fund CRUD operations")
@RestController
@CrossOrigin("*")
public class CharityController {
	@Autowired
	private CharityService service;

	@PostMapping("/add")
	public CharityEntity add(@RequestBody CharityEntity c) { return service.add(c); }

	@GetMapping("/all")
	public List<CharityEntity> getAll() { return service.getAll(); }

	@GetMapping("/get/{id}")
	public CharityEntity getById(@PathVariable Long id) { return service.getById(id); }

	
	@PutMapping("/update")
	public CharityEntity update(@RequestBody CharityEntity c) { return service.update(c); }

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) { service.delete(id); return "Deleted"; }
}
