package com.udea.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.udea.cart.model.Cart;

public interface ICartJpaRepository  extends JpaRepository<Cart, String> {

}
