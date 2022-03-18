package com.redhat.consulting.fuse.model;

import java.io.Serializable;

public class CountryModel implements Serializable {

	private static final long serialVersionUID = -5000132224861202987L;
	private String id;
	private String name;
	
	public CountryModel() {
		super();
	}
	
	public CountryModel(String id) {
		super();
		this.id = id;
	}	
	
	public CountryModel(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
