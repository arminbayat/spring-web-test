package com.bayat.armin.springwebservice.controller;

import com.bayat.armin.springwebservice.model.Item;
import com.bayat.armin.springwebservice.service.ItemBusinessService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
