package com.bayat.armin.springwebservice.service;

import com.bayat.armin.springwebservice.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    public Item retrieveHardCodedItem() {
        return Item.builder()
                .id(1)
                .name("item1")
                .price(1000)
                .quantity(1000)
                .build();
    }
}
