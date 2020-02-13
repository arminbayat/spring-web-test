package com.bayat.armin.springwebservice.service;

import com.bayat.armin.springwebservice.data.ItemRepository;
import com.bayat.armin.springwebservice.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService itemBusinessService;

    @Mock
    private ItemRepository repository;

    @Test
    public void retrieveAllItems() {
        when(repository.findAll()).thenReturn(Arrays.asList(
                Item.builder().name("item1").price(100).quantity(10).id(1).build(),
                Item.builder().name("item2").price(200).quantity(20).id(2).build()));

        List<Item> result = itemBusinessService.retrieveAllItems();

        assertEquals(2, result.size());
        assertEquals(1000, result.get(0).getValue());
        assertEquals(4000, result.get(1).getValue());
    }
}