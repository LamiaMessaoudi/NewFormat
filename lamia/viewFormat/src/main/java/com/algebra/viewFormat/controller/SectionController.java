package com.algebra.viewFormat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algebra.viewFormat.entities.Section;
import com.algebra.viewFormat.service.SectionService;

@CrossOrigin("*")
@RestController
public class SectionController {
	@Autowired
	private SectionService sectionService;
	@GetMapping("/sections")
	List<Section> getallSection(){
		List<Section> sec =sectionService.getallSection();
		return sec;
		
	}

}
