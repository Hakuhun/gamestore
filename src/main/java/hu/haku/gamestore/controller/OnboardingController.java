package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.UserToken;
import hu.haku.gamestore.persistence.dao.UserDataService;
import hu.haku.gamestore.persistence.model.JPARole;
import hu.haku.gamestore.persistence.model.JPAUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController("/gamestore/v1/onboard")
@RequiredArgsConstructor
public class OnboardingController {
    private final UserDataService userDataService;
    @PostMapping("/login")
    public ResponseEntity<UserToken> createCart(
    ) {
        userDataService.saveUser(new JPAUser(null, "geri", "123", Arrays.asList(new JPARole(null, "ADMIN"))));
        return null;
    }
}
