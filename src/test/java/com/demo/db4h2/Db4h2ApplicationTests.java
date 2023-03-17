package com.demo.db4h2;

import com.demo.db4h2.repository.StockRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class Db4h2ApplicationTests {

    @Autowired
    private StockRepository repository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }



}
