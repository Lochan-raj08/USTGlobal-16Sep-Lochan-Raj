package com.ustglobal.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                  // desc for entity class
@Table(name="product")  //desc for table name
public class Product {
	
	@Id                     //to make id as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")      //to map the column of db to entity class
	private int id;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="quantity")
	private int quantity;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
