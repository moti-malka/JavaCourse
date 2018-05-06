package com.moti;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemsServicesImpl implements ItemsServices {

	
	@Autowired
	private ItemReposetory dao;
	
	
	@Override
	public Item CreateItems(String name) {
		return dao.save(new Item(null, name));
	}

}
