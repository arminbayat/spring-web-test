package com.bayat.armin.springwebservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {

    @Id
    private int id;
    private String name;
    private int price;
    private int quantity;

    @Transient
    private int value;
}
