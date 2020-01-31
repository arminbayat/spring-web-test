package com.bayat.armin.springwebservice.controller;

import com.bayat.armin.springwebservice.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return Item.builder()
                .id(1)
                .name("item1")
                .price(1000)
                .quantity(1000)
                .build();
    }
}
