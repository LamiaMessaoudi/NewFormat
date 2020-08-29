package com.algebra.viewFormat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.algebra.viewFormat.entities.View2;
@Service
public class ViewServiceImpl implements ViewService {

	@Override
	public List<View2> getall() {
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
