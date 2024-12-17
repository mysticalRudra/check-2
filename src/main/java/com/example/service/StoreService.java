package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.StoreRepo;
import com.example.entity.Store;

import java.util.List;

@Service
public class StoreService {
	
	    @Autowired
	    private StoreRepo storeRepository;

	    public List<Store> getAllValues() {
	        return storeRepository.findAll();
	    }
	

}
