package com.arnav.todoApp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.arnav.todoApp.model.Item;
import com.arnav.todoApp.model.ListOfItem;

@Repository
@Component
public interface ListOfItemRepo extends CrudRepository<ListOfItem,Long> {
	
	/*@Query("select id from ListOfItem")
	ArrayList<Item> getAllLists();*/
	@Query("select l from ListOfItem l")
	ArrayList<ListOfItem> findAll1();
	
	

}
