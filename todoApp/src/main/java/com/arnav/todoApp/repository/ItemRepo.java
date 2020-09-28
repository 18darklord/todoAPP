package com.arnav.todoApp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.arnav.todoApp.model.Item;

@Repository
@Component
public interface ItemRepo extends CrudRepository<Item,Long>{
	
	
	@Query("select i from Item i  where i.parentId=?1")
	ArrayList<Item> getAllByParentId(Long id);
	
	@Query("select i from Item i where i.id=?1")
	Item findById1(Long id);

}
