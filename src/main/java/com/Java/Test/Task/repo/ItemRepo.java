package com.Java.Test.Task.repo;

import com.Java.Test.Task.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

    //we can use a Data JPA instead of storing in memory for industry standard


    /*private final List<Item> items = new ArrayList<>();

    public Item save(Item item) {
        items.add(item);
        return item;
    }

    public Optional<Item> findById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}*/


}
