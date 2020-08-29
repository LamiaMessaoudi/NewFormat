package com.algebra.viewFormat.entities;

import java.io.Serializable;

public class Section implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String section;
	public Section(String section, String title, Boolean root, String bullet, String icon) {
		super();
		this.section = section;
		this.title = title;
		this.root = root;
		this.bullet = bullet;
		this.icon = icon;
	}
	private String title;
	private Boolean root;
	private String bullet;
	private String icon;
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getRoot() {
		return root;
	}
	public void setRoot(Boolean root) {
		this.root = root;
	}
	public String getBullet() {
		return bullet;
	}
	public void setBullet(String bullet) {
		this.bullet = bullet;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	} 

}
