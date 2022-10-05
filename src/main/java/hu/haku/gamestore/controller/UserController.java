package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.ShoppingCart;
import hu.haku.gamestore.model.User;
import hu.haku.gamestore.model.UserLibrary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("gamestore/v1/user")
public class UserController {

    @PostMapping("")
    public ResponseEntity<User> createUser(
            @RequestBody User user
    ) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserLibrary> getUser(
            @PathVariable("id") String id
    ){
        return null;
    }

    @PostMapping("/{id}/cart")
    public ResponseEntity<ShoppingCart> createCart(
            @PathVariable("id") String id
    ){
        return null;
    }
}
