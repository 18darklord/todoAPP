package com.arnav.todoApp.formatter;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.arnav.todoApp.model.Item;

@Component
public class ApiOutput {
	
	private Long id;
	private String name;
	private String description;
	private ArrayList<Item> items;

	public ApiOutput() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	
}
