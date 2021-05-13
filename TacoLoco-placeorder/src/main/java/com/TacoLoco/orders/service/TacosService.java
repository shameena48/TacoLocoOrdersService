package com.TacoLoco.orders.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TacoLoco.orders.Model.Orders;
import com.TacoLoco.orders.Model.Tacos;
import com.TacoLoco.orders.repository.TacosRepository;

@Service
public class TacosService {

	@Autowired
	private TacosRepository tacosRepository;
	
	public List<Tacos> getAllItems(){
		return tacosRepository.findAll();
	}
	
	public Tacos getPriceByItem(String itemname){
		return tacosRepository.findByitemname(itemname);
	}
	
	public List<Tacos> saveItems(List<Tacos> tacos){
		return tacosRepository.saveAll(tacos);
	}
	
	public Map<String,Object> getOrderTotal(Orders order){
		int totalQuantity = 0;
		double totalPrice = 0.0;
		Map<String,Object> map = new HashMap<String,Object>();
		// calculating totalprice of the order
		if(order != null) {
			List<Tacos> tacos = order.getItems();
			for(Tacos taco : tacos) {
				totalPrice = totalPrice + (taco.getQuantity() * taco.getPrice());
				totalQuantity = totalQuantity + taco.getQuantity(); 
			}
			// Avail 20% discount on total order
			if(totalQuantity >= 4) {
				totalPrice = totalPrice - (totalPrice * (0.2));
			}
			map.put("Order Total", totalPrice);
		}else {
			System.out.println("order is empty!");
		}
		return map;
		
	}
}
