/**
 * 
 */
package com.arnav.todoApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arnav.todoApp.model.Item;
import com.arnav.todoApp.repository.ItemRepo;

/**
 * @author arnav
 *
 */
@Component
public class UpdateItemService {
	
	@Autowired
	ItemRepo itemRepo;
	
	//update item parent id
    public boolean updateItem(  Item postRequest) {
    		//Optional<Item> item =itemRepo.findById(id);
    	
    		Item item =itemRepo.findById1(postRequest.getId());
            item.setName(postRequest.getName());
            item.setDescription(postRequest.getDescription());
            item.setParentId(postRequest.getParentId());
            itemRepo.save(item);
            return true;
    	
    	
    }
    
    public boolean deleteItem(  Item postRequest) {
		
        itemRepo.delete(postRequest);
        return true;
	
	
}
}
