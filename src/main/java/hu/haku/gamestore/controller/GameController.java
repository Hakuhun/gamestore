package hu.haku.gamestore.controller;

import hu.haku.gamestore.converter.BusinessGameConverter;
import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.GameDetail;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.service.GameService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/gamestore/v1/store/games")
@RequiredArgsConstructor
public class GameController {

    private final BusinessGameConverter businessGameConverter;
    private final GameService service;
    private final GameControllerValidator validator;

    @PostMapping("")
    public ResponseEntity<Game> createGameEntry(
            @RequestBody Game body
    ) {
        validator.validatePost(body);
        BGame game = businessGameConverter.to(body);
        return ResponseEntity.created(null).body(businessGameConverter.from(service.addNewEntry(game)));
    }

    @GetMapping("")
    public ResponseEntity<List<Game>> findGames(
            @RequestParam("title") String title,
            @RequestParam("tags") List<String> tags
    ){
        throw new NotImplementedException();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> createGameEntry(
            @PathVariable("id") String id
    ) {
        validator.validateGet(id);
        return ResponseEntity.ok(businessGameConverter.from(service.findGameById(id)));
    }

    @PostMapping("/{gameId}/detail")
    public ResponseEntity<GameDetail> createDetail(
            @PathVariable("gameId") String id,
            @RequestBody GameDetail body
    ) {
        throw new NotImplementedException();
    }

    @PatchMapping("/{gameId}/details/{detailId}")
    public ResponseEntity<Game> editDetail(
            @PathVariable("gameId") String gameId,
            @PathVariable("detailId") String detailId,
            @RequestBody Game body,
            @RequestParam("fields") List<String> fields
    ) {
        throw new NotImplementedException();
    }

    @PostMapping("/{gameId}/price")
    public ResponseEntity<GameDetail> createPrice(
            @PathVariable("gameId") String id,
            @RequestBody GameDetail body
    ) {
        throw new NotImplementedException();
    }

    @PatchMapping("/{gameId}/details/{detailId}")
    public ResponseEntity<Game> editPrice(
            @PathVariable("gameId") String gameId,
            @PathVariable("detailId") String detailId,
            @RequestBody Game body,
            @RequestParam("fields") List<String> fields
    ) {
        throw new NotImplementedException();
    }
}
