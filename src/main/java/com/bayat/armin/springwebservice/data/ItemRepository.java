package com.bayat.armin.springwebservice.data;

import com.bayat.armin.springwebservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
