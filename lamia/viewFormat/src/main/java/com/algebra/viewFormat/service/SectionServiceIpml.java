package com.algebra.viewFormat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.algebra.viewFormat.entities.Section;

@Service
public class SectionServiceIpml implements SectionService {

	@Override
	public List<Section> getallSection() {

		List<Section> secList = new ArrayList<>();
		Section sec=new Section("Mortgage","Mortgage",true,"dot","flaticon2-user-outline-symbol");
		secList.add(sec);
		return secList;
	}

}
