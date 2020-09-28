package com.arnav.todoApp.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

import com.arnav.todoApp.formatter.ApiOutput;
import com.arnav.todoApp.model.Item;
import com.arnav.todoApp.service.ListService;
import com.arnav.todoApp.service.UpdateItemService;

@RestController
public class MainController {

	@Autowired
	ListService ret;
	
	@Autowired
	UpdateItemService updateItem;
	
	
	@GetMapping("/api/getAllLists")
	public ArrayList<ApiOutput> mainGet() {
		return ret.getAllLists();
	}
	
	@PutMapping("/api/updateItem")
	public boolean updateItem( @RequestBody Item item) {
		return updateItem.updateItem(item);
	}
	
	@DeleteMapping("/api/deleteItem")
	public boolean deleteItem( @RequestBody Item item) {
		return updateItem.deleteItem(item);
	}

}
