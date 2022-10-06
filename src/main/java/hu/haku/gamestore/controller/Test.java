package hu.haku.gamestore.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class Test {
    @GetMapping("")
    public String weGotACityToBurn(){
        return "Wake the f up samurai";
    }
}
