package edu.cu.cs6156_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cu.cs6156_order.pojo.OrderedDish;
import edu.cu.cs6156_order.service.OrderedDishesService;
import edu.cu.cs6156_order.mapper.OrderedDishesMapper;
import org.springframework.stereotype.Service;

/**
* @author zeqing wang
* @description 针对表【ordered_dishes】的数据库操作Service实现
* @createDate 2022-10-28 15:48:47
*/
@Service
public class OrderedDishesServiceImpl extends ServiceImpl<OrderedDishesMapper, OrderedDish>
    implements OrderedDishesService{

}




