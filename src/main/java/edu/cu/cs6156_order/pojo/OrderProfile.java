package edu.cu.cs6156_order.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName order_profile
 */
@TableName(value ="order_profile")
@Data
public class OrderProfile implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer orderId;

    /**
     * 
     */
    private String accountId;

    /**
     * 
     */
    private Date orderTime;

    /**
     * 
     */
    private Integer total;

    private Integer restId;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}