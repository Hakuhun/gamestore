package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.ShoppingCart;
import hu.haku.gamestore.model.UserToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/gamestore/v1/onboard")
public class OnboardingController {
    @PostMapping("/login")
    public ResponseEntity<UserToken> createCart(

    ){
        return null;
    }
}
