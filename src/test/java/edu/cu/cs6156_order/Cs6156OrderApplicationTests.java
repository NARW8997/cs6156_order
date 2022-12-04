package edu.cu.cs6156_order;

import edu.cu.cs6156_order.mapper.OrderProfileMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cs6156OrderApplicationTests {
    @Autowired
    OrderProfileMapper orderProfileMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        System.out.println(orderProfileMapper.selectAllByAccountId(6));
    }
}
