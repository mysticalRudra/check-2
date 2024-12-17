package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Store;
@Repository
public interface StoreRepo extends JpaRepository<Store, Long> {
}

