package com.jlw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlw.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
