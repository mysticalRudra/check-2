package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Store;
import com.example.service.StoreService;

import java.util.List;


@RestController
@RequestMapping("/api/store")
public class StoreController {

	    @Autowired
	    private StoreService storeService;

	    @GetMapping
	    public List<Store> getAllUsers() {
	        return storeService.getAllValues();
	    }
	

}
