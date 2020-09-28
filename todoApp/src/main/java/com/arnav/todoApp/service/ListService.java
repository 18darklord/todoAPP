package com.arnav.todoApp.service;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arnav.todoApp.formatter.ApiOutput;
import com.arnav.todoApp.model.Item;
import com.arnav.todoApp.model.ListOfItem;
import com.arnav.todoApp.repository.ItemRepo;
import com.arnav.todoApp.repository.ListOfItemRepo;

@Component
public class ListService {

	@Autowired
	ListOfItemRepo listOfItem;
	@Autowired
	ItemRepo item;
	/*@Autowired
	ApiOutput temp;*/
	public ArrayList<ApiOutput> getAllLists()
	{
		/*
		private Long id;
		private String name;
		private String description;
		private ArrayList<Item> items;*/
		ArrayList<ListOfItem> list= listOfItem.findAll1();
		//HashMap<String,ArrayList<Item>> ret=new HashMap<>();
		ArrayList<ApiOutput> ret = new ArrayList<>();
		for (int i=0;i<list.size();i++)
		{
	         ListOfItem element = list.get(i);
	         ArrayList<Item> listItem=item.getAllByParentId(element.getId());
	         ApiOutput temp=new ApiOutput();
	         temp.setId(element.getId());
	         temp.setName(element.getName());
	         temp.setDescription(element.getDescription());
	         temp.setItems(listItem);
	         ret.add(temp);
	    }
		return ret;
	}

}
