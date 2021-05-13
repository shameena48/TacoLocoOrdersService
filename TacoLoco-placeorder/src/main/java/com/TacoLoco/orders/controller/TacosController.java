package com.TacoLoco.orders.controller;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TacoLoco.orders.Model.Orders;
import com.TacoLoco.orders.Model.Tacos;
import com.TacoLoco.orders.service.TacosService;

@RestController
@RequestMapping("/tacoloco/v1")
public class TacosController {

	@Autowired
	private TacosService tacosService;
	
	// Get All Items in menu
	@GetMapping("/listitems")
	public List<Tacos> getAllItems(){
		return tacosService.getAllItems();
	}
	
	@GetMapping("/priceByItem/{itemname}")
	public Tacos getPriceByItem(@PathVariable(name = "itemname") String itemname){
		return tacosService.getPriceByItem(itemname);
	}
	
	@PostMapping("/saveItems")
	public List<Tacos> saveMenuItems(@RequestBody List<Tacos> tacos){
		return tacosService.saveItems(tacos);
	}
	
	// Calculate orderTotal
	@PostMapping("/placeOrder")
	public Map<String, Object> getOrderTotal(@RequestBody Orders order){
		Map<String, Object> response = new HashMap<String, Object>();
		assertNotNull("Your Order cannot be Empty!", order);
		response = tacosService.getOrderTotal(order);
		return response;
	}
}
