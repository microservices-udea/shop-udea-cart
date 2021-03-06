package com.udea.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cart.service.Cart;
@RestController
@RequestMapping(path = "/shoppingcart")
public class CartController {

	@Autowired
	Cart ICart;
	

	/** TO-DO*/
	@DeleteMapping(path = "/cleanCart", produces = MediaType.APPLICATION_JSON_VALUE)
	public void cleanCart(@RequestParam String JsonProduct) {
	
		ICart.cleanCart(JsonProduct);
		
	}
	
	/** TO-DO*/
	@GetMapping(path = "/getCart",  produces = MediaType.APPLICATION_JSON_VALUE)
	public void getCart(@RequestParam String JsonProduct) {
	
		ICart.getCart(JsonProduct);
		
	}
	
	/** TO-DO*/
	@PutMapping(path = "/checkOutCart", produces = MediaType.APPLICATION_JSON_VALUE)
	public void checkOutCart(@RequestParam String JsonProduct) {
	
		ICart.checkOutCart(JsonProduct);
		
	}
	
	/** TO-DO*/
	@PostMapping(path = "/CreateCart", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createCart(@RequestParam String persona) {
	
		ICart.createCart(persona);
		
	}

	
	
	
}
