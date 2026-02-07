package com.Java.Test.Task.service;

import com.Java.Test.Task.entity.Item;
import com.Java.Test.Task.repo.ItemRepo;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepo itemRepo;

    public ItemServiceImpl(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found" + id));

    }
}
