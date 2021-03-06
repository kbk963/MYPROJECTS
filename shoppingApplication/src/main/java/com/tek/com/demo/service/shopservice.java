package com.tek.com.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tek.com.demo.model.Items;
import com.tek.com.demo.model.finalorder;
import com.tek.com.demo.repository.connection;

public class shopservice {
	connection c;

	List<Items> itemslist = new ArrayList<Items>(Arrays.asList(new Items("1", "Samsung s8", 650, "Specs: RAM-4gb"),
			new Items("2", "Samsung s8 plus", 750, "Specs: RAM-6gb"),
			new Items("3", "Apple Iphone 7s", 850, "Specs: RAM-3gb"),
			new Items("4", "Apple Iphone8", 1050, "Specs: RAM-6gb")));

	public List<Items> getItems() {
		return itemslist;
	}

	public int save(finalorder r) {
		c = new connection();
		return c.save(r);
	}

	public Items getitem(String id) {
		Items it = null;
		Items returnItem = null;
		Optional<Items> optional = itemslist.stream().filter(t -> t.getItemNo().equals(id)).findFirst();

		if (optional.isPresent()) {// Check whether optional has element you are looking for
			it = optional.get();// get it from optional
		}
		return it;
	}
}
