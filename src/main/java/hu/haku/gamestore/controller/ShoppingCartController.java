package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.ShoppingCart;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("gamestore/v1")
public class ShoppingCartController {
    @PostMapping("/cart")
    public ResponseEntity<ShoppingCart> createCart(
        @RequestParam("username") String username,
        @RequestParam("password") String password
    ){
        return null;
    }
}
