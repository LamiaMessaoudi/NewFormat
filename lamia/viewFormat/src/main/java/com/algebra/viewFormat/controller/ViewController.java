package com.algebra.viewFormat.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algebra.viewFormat.entities.View2;

@CrossOrigin("*")
@RestController
public class ViewController {
//	@Autowired
//	private ViewService viewService;
	
	@GetMapping("/views")
	public List<View2>getall(){
		List<View2>views=new ArrayList<>();
		View2 v1=new View2 (1,"manel");
		View2 v2=new View2 (2,"khalid");
		View2 v3=new View2 (3,"imen");

        views.add(v2);
        views.add(v3);
		views.add(v1);
		return views;
		
	}

}

// class View2  {
//	
//		public View2() {
//			// TODO Auto-generated constructor stub
//		}
//
//		
//
//		private int id;
//		private String name;
//
//		
//		public View2(int id, String name) {
//			super();
//			this.id = id;
//			this.name = name;
//		}
//
//
//		public int getId() {
//			return id;
//		}
//
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//
//		public String getName() {
//			return name;
//		}
//
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		
//		
//		
		

	
