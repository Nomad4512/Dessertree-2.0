package com.dessertree.springboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class IndexControllerTest {

    @Autowired
    private IndexController indexController;

    @Test
    public void hello_리턴() {
        assertThat(IndexController.hello()).isEqualTo("hello");

    }
}
