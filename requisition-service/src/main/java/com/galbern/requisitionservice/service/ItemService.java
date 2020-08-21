package com.galbern.requisitionservice.service;

import com.galbern.requisitionservice.domain.Item;

import java.util.List;

public interface ItemService {
    public Item create(Item item);
    public Item find(Long id);
    public List<Item> findAll();
    public void update(Long id, Item item);
    public void delete(Long id);

    Item findById(Long id);
}
