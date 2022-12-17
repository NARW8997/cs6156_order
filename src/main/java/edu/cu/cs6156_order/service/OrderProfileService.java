package edu.cu.cs6156_order.service;

import edu.cu.cs6156_order.pojo.OrderProfile;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zeqing wang
* @description 针对表【order_profile】的数据库操作Service
* @createDate 2022-10-28 15:34:09
*/
public interface OrderProfileService extends IService<OrderProfile> {
    List<OrderProfile> getAllByAccountId(String accountId);

    Boolean removeNestedById(Integer orderId);
}
