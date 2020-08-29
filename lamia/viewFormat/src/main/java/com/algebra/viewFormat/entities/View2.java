package com.algebra.viewFormat.entities;

import java.io.Serializable;

//@Entity
//
//@Setter
//@Getter
////@ToString
public class View2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public View2() {
		super();
		// TODO Auto-generated constructor stub
	}

	

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;

	
	public View2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
	
	

}
