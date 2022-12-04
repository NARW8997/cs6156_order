package edu.cu.cs6156_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cu.cs6156_order.pojo.OrderProfile;
import edu.cu.cs6156_order.service.OrderProfileService;
import edu.cu.cs6156_order.mapper.OrderProfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zeqing wang
* @description 针对表【order_profile】的数据库操作Service实现
* @createDate 2022-10-28 15:34:09
*/
@Service
public class OrderProfileServiceImpl extends ServiceImpl<OrderProfileMapper, OrderProfile>
    implements OrderProfileService{

    @Autowired
    OrderProfileMapper orderProfileMapper;
    @Override
    public List<OrderProfile> getAllByAccountId(Integer accountId) {
        return orderProfileMapper.selectAllByAccountId(accountId);
    }
}




