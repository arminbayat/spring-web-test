package com.bayat.armin.springwebservice.model;

import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Item {
    private int id;
    private String name;
    private int price;
    private int quantity;
}