package com.bayat.armin.springwebservice.service;

import com.bayat.armin.springwebservice.data.ItemRepository;
import com.bayat.armin.springwebservice.model.Item;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ItemBusinessService {

    private ItemRepository itemRepository;

    public Item retrieveHardCodedItem() {
        return Item.builder()
                .id(1)
                .name("item1")
                .price(1000)
                .quantity(1000)
                .build();
    }

    public List<Item> retrieveAllItems() {
        List<Item> items = itemRepository.findAll();
        for (Item item : items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return items;
    }
}
