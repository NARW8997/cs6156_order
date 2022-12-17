package edu.cu.cs6156_order.mapper;
import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.cu.cs6156_order.pojo.OrderedDish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author zeqing wang
* @description 针对表【ordered_dishes】的数据库操作Mapper
* @createDate 2022-10-28 15:48:47
* @Entity edu.cu.cs6156_order.pojo.OrderedDishes
*/
@Repository
public interface OrderedDishesMapper extends BaseMapper<OrderedDish> {
    List<OrderedDish> getAllByOrderId(@Param("orderId") Integer orderId);

    Integer insertBatch(@Param("orderedDishCollection") Collection<OrderedDish> orderedDishCollection);
}




