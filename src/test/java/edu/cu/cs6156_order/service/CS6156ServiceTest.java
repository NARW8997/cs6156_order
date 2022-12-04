package edu.cu.cs6156_order.service;

import edu.cu.cs6156_order.mapper.OrderProfileMapper;
import edu.cu.cs6156_order.mapper.OrderedDishesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CS6156ServiceTest {

    @Autowired
    private OrderedDishesMapper dishesMapper;

    @Autowired
    private OrderProfileMapper profileMapper;


    @Test
    public void test01() {
        System.out.println(dishesMapper.selectList(null));
        System.out.println(profileMapper.selectList(null));
    }
}
