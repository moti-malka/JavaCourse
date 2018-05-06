package com.moti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="items")
public class Item {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	
	public Item() {
		super();
	}

	public Item(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long  getId() {
		return id;
	}
	public void setId(Long  id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
