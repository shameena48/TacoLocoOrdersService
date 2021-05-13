package com.TacoLoco.orders;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.TacoLoco.orders.Model.Orders;
import com.TacoLoco.orders.Model.Tacos;
import com.TacoLoco.orders.service.TacosService;

class TacosOrderTest {

	private TacosService tacosService;	
	private Tacos tacos;
	private Orders order;
	
	@Test
	public void testTacosOrder() {
		List<Tacos> listTacos = new ArrayList<Tacos>();
		 tacos = new Tacos();
		tacos.setId(1);
		tacos.setItemname("Veggie Taco");
		tacos.setQuantity(4);
		tacos.setPrice(2.50);
		listTacos.add(tacos);
		order = new Orders();
		order.setItems(listTacos);
		order.setOrderId(1);
		tacosService = new TacosService();
		Map<String,Object> actualResult = tacosService.getOrderTotal(order);
		Map<String,Object> expectedOutput = new HashMap<String,Object>();
		expectedOutput.put("Order Total", 8.0);
		assertEquals(expectedOutput, actualResult);
	}


}
