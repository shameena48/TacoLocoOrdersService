package com.TacoLoco.orders.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tacos")
public class Tacos{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "item_name")
	private String itemname;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private double price;
	
	public Tacos() {
		super();
	}

	public Tacos(long id, String itemname, int quantity, double price) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.quantity = quantity;
		this.price = price;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
