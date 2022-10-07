package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.ShoppingCart;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/gamestore/v1/cart")
public class ShoppingCartController {
    @PostMapping("/cart")
    public ResponseEntity<ShoppingCart> createCart(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        return null;
    }
}
