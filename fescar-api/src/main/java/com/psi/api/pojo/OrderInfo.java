package com.psi.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value = "order_info")
public class OrderInfo implements Serializable {

    @TableId(type = IdType.AUTO)
    @TableField(value = "id")
    private Integer id;//主键

    @TableField(value = "message")
    private String message;//留言

    @TableField(value = "money")
    private Integer money;//总金额

    //get方法
    public Integer getId() {
        return id;
    }

    //set方法
    public void setId(Integer id) {
        this.id = id;
    }

    //get方法
    public String getMessage() {
        return message;
    }

    //set方法
    public void setMessage(String message) {
        this.message = message;
    }

    //get方法
    public Integer getMoney() {
        return money;
    }

    //set方法
    public void setMoney(Integer money) {
        this.money = money;
    }


}
