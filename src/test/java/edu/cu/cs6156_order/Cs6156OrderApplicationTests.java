package edu.cu.cs6156_order;

import edu.cu.cs6156_order.mapper.OrderProfileMapper;
import edu.cu.cs6156_order.mapper.OrderedDishesMapper;
import edu.cu.cs6156_order.pojo.OrderedDish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Cs6156OrderApplicationTests {
    @Autowired
    OrderProfileMapper orderProfileMapper;

    @Autowired
    OrderedDishesMapper orderedDishesMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        System.out.println(orderProfileMapper.selectAllByAccountId("6"));
    }

    @Test
    void test02() {
        List<OrderedDish> all = orderedDishesMapper.getAllByOrderId(1);
        System.out.println(all);
    }
}
