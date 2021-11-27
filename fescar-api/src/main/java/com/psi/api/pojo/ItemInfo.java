package com.psi.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value="item_info")
public class ItemInfo implements Serializable{

	@TableId(type = IdType.AUTO)
	@TableField(value = "id")
	private Integer id;//

	@TableField(value = "name")
	private String name;//商品名称

	@TableField(value = "count")
	private Integer count;//商品数量

	@TableField(value = "price")
	private Integer price;//商品价格



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getName() {
		return name;
	}

	//set方法
	public void setName(String name) {
		this.name = name;
	}
	//get方法
	public Integer getCount() {
		return count;
	}

	//set方法
	public void setCount(Integer count) {
		this.count = count;
	}
	//get方法
	public Integer getPrice() {
		return price;
	}

	//set方法
	public void setPrice(Integer price) {
		this.price = price;
	}


}
