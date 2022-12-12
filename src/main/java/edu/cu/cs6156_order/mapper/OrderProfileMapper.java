package edu.cu.cs6156_order.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.cu.cs6156_order.pojo.OrderProfile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author zeqing wang
* @description 针对表【order_profile】的数据库操作Mapper
* @createDate 2022-10-28 15:34:09
* @Entity edu.cu.cs6156_order.pojo.OrderProfile
*/
@Repository
public interface OrderProfileMapper extends BaseMapper<OrderProfile> {
    List<OrderProfile> selectAllByAccountId(@Param("accountId") String accountId);
}




