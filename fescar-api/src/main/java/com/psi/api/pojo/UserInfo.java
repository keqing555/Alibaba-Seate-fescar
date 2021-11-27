package com.psi.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value="user_info")
public class UserInfo implements Serializable{

	@TableId(type = IdType.INPUT)
	@TableField(value = "account")
	private String account;//

	@TableField(value = "money")
	private Integer money;//

	@TableField(value = "name")
	private String name;//



	//get方法
	public String getAccount() {
		return account;
	}

	//set方法
	public void setAccount(String account) {
		this.account = account;
	}
	//get方法
	public Integer getMoney() {
		return money;
	}

	//set方法
	public void setMoney(Integer money) {
		this.money = money;
	}
	//get方法
	public String getName() {
		return name;
	}

	//set方法
	public void setName(String name) {
		this.name = name;
	}


}
