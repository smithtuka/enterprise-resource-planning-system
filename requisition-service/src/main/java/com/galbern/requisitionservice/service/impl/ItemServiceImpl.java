package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Item;
import com.galbern.requisitionservice.repository.ItemRepository;
import com.galbern.requisitionservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item find(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public void update(Long id, Item item) {
        Item item1 = itemRepository.findById(id).get();
        item1.setName(item.getName());
        item1.setPrice(item.getPrice());
        item1.setQuantity(item.getQuantity());
        item1.setRequisition(item.getRequisition());
        item1.setSupplier(item.getSupplier());
        itemRepository.save(item1);
    }

    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id).get();
    }
}
