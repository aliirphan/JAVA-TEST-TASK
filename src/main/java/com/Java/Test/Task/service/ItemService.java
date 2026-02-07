package com.Java.Test.Task.service;

import com.Java.Test.Task.entity.Item;


public interface ItemService {

    Item addItem(Item item);

    Item getItemById(Long id);


}
