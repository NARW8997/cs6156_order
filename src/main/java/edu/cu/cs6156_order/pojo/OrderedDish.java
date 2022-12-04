package edu.cu.cs6156_order.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ordered_dishes
 */
@Data
@TableName(value ="ordered_dishes")
public class OrderedDish implements Serializable {
    /**
     * Primary key in ordered_dishes
     */
    @TableId(type = IdType.AUTO)
    private Integer dishId;

    /**
     * Foreign key link to order_profile
     */
    private Integer orderId;

    /**
     * what dish did the client ordered
     */
    private Integer orderedDishId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}