package com.galbern.requisitionservice.controller;


import com.galbern.requisitionservice.domain.Item;
import com.galbern.requisitionservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public  class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public String welcome(){
        return "ITEM SERVICE RECEPTION - you are welcome!!";
    }

    @PostMapping
    public void save(@RequestBody Item item){
         itemService.create(item);
    }
    @GetMapping("/{id}")
    public void findById(@PathVariable("id") Long id){
        itemService.findById(id);
    }

    @GetMapping("/all")
    public List<Item> findAll(){
        return itemService.findAll();
    }
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Item item){
        itemService.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        itemService.delete(id);
    }
}
