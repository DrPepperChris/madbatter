package com.madbatter.spring.mysql.repo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

	// we will add different cake types and customizations in this class.
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	
	// desired text on cake
	@Column(name = "desiredText")
	private String desiredText;

	// id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	// size
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	

	// cost
	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

	// desired date
	public String getDDate() {
		return dDate;
	}

	public void setDDate(String dDate) {
		this.dDate = dDate;
	}
	

	// description
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

	// color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//complete order
	@Override
	public String toString() {
		return "Cake [id=" + id + "]";
	}
}
