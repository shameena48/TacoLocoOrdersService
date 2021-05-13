package com.TacoLoco.orders.Model;

import java.util.List;

public class Orders {
	
	private long orderId;
	private List<Tacos> items;
	
	public Orders(long orderId, List<Tacos> items) {
		super();
		this.orderId = orderId;
		this.items = items;
	}
	public Orders() {
		super();
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public List<Tacos> getItems() {
		return items;
	}
	public void setItems(List<Tacos> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", items=" + items + "]";
	}
	
	
}
