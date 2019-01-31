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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	// size
	
	// cost
	
	// desired date
	
	// description
	
	// color
	
	//complete order
	@Override
	public String toString() {
		return "Cake [id=" + id + "]";
	}
}
