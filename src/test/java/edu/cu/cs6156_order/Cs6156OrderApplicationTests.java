package edu.cu.cs6156_order;

import edu.cu.cs6156_order.mapper.OrderProfileMapper;
import edu.cu.cs6156_order.mapper.OrderedDishesMapper;
import edu.cu.cs6156_order.pojo.OrderProfile;
import edu.cu.cs6156_order.pojo.OrderedDish;
import edu.cu.cs6156_order.service.OrderedDishesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Cs6156OrderApplicationTests {
    @Autowired
    OrderProfileMapper orderProfileMapper;

    @Autowired
    OrderedDishesService orderedDishesService;

    @Test
    void contextLoads() {
    }


    @Test
    void test02() {
    }

}
