package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.ShoppingCart;
import hu.haku.gamestore.model.User;
import hu.haku.gamestore.model.UserLibrary;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("gamestore/v1/")
public class UserController {
    @PostMapping("user")
    public ResponseEntity<User> createUser(
            @RequestBody User user
    ) {
        return null;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<UserLibrary> getUser(
            @PathVariable("id") String id
    ){
        return null;
    }

}
