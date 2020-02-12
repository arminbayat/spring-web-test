package com.bayat.armin.springwebservice.controller;

import com.bayat.armin.springwebservice.model.Item;
import com.bayat.armin.springwebservice.service.ItemBusinessService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ItemController {

    private ItemBusinessService itemBusinessService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return Item.builder()
                .id(1)
                .name("item1")
                .price(1000)
                .quantity(1000)
                .build();
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        return itemBusinessService.retrieveHardCodedItem();
    }

    @GetMapping("/items-from-database")
    public List<Item> findAllItemsFromDatabase() {
        List<Item> items = itemBusinessService.retrieveAllItems();
        for (Item item : items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return items;
    }
}
