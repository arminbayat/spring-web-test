package com.bayat.armin.springwebservice.controller;

import com.bayat.armin.springwebservice.model.Item;
import com.bayat.armin.springwebservice.service.ItemBusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemController.class)
class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemBusinessService itemBusinessService;

    @Test
    void dummyItem_Basic() throws Exception {

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);

        mockMvc
                .perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"item1\",\"price\":1000,\"quantity\":1000}"))
                .andReturn();


    }

    @Test
    void itemBusinessService_basic() throws Exception {

        when(itemBusinessService.retrieveHardCodedItem()).thenReturn(
                Item.builder()
                        .id(2)
                        .quantity(1)
                        .price(10)
                        .name("hasan")
                        .build());

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get("/item-from-business-service")
                .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":2,\"name\":\"hasan\",\"price\":10,\"quantity\":1}"))
                .andReturn();
    }
}