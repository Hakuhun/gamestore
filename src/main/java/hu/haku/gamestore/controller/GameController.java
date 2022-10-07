package hu.haku.gamestore.controller;

import hu.haku.gamestore.converter.BusinessGameConverter;
import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/gamestore/v1/games")
@RequiredArgsConstructor
public class GameController {

    private final BusinessGameConverter businessGameConverter;
    private final GameService service;

    @PostMapping("")
    public ResponseEntity<Game> createGameEntry(
            @RequestBody Game body
    ) {
        BGame game = businessGameConverter.to(body);

        return ResponseEntity.created(null).body(businessGameConverter.from(service.addNewEntry(game)));
    }
}
