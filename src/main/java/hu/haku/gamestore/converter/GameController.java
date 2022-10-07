package hu.haku.gamestore.converter;

import hu.haku.gamestore.controller.BusinessGameDetailConverter;
import hu.haku.gamestore.controller.GameControllerValidator;
import hu.haku.gamestore.converter.BusinessGameConverter;
import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.GameDetail;
import hu.haku.gamestore.model.Price;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.service.GameService;
import io.swagger.v3.oas.annotations.headers.Header;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/gamestore/v1/store/games")
@RequiredArgsConstructor
public class GameController {

    private final BusinessGameConverter businessGameConverter;
    private final BusinessGameDetailConverter businessDetailConverter;
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
    public ResponseEntity<Page<Game>> findGames(
            @RequestParam("title") String title,
            @RequestParam("tags") List<String> tags,
            @RequestParam("size") int size,
            @RequestParam("page") int page
    ) {
        Page<Game> games = service.findListByTagsAndTitle(title, tags, PageRequest.of(page, size, Sort.unsorted())).map(businessGameConverter::from);
        return ResponseEntity.status(206).body(games);
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
            @PathVariable("gameId") String gameId,
            @RequestBody GameDetail body
    ) {
        service.addNewGameDetail(gameId, businessDetailConverter.from(body));
    }

    @GetMapping("/{gameId}/details/{detailId}")
    public ResponseEntity<GameDetail> getDetail(
            @PathVariable("gameId") String gameId,
            @PathVariable("detailId") String detailId
    ) {
        throw new NotImplementedException();
    }

    @GetMapping("/{gameId}/details/")
    public ResponseEntity<List<GameDetail>> getDetails(
            @PathVariable("gameId") String gameId
    ) {
        throw new NotImplementedException();
    }

    @PatchMapping("/{gameId}/details/{detailId}")
    public ResponseEntity<GameDetail> editDetail(
            @PathVariable("gameId") String gameId,
            @PathVariable("detailId") String detailId,
            @RequestBody GameDetail body,
            @RequestParam("fields") List<String> fields
    ) {
        throw new NotImplementedException();
    }

    @PostMapping("/{gameId}/price")
    public ResponseEntity<Price> createPrice(
            @PathVariable("gameId") String id,
            @RequestBody Price body
    ) {
        throw new NotImplementedException();
    }

    @GetMapping("/{gameId}/price/{priceId}")
    public ResponseEntity<Price> getPrice(
            @PathVariable("gameId") String gameId,
            @PathVariable("priceId") String priceId
    ) {
        throw new NotImplementedException();
    }

    @GetMapping("/{gameId}/price")
    public ResponseEntity<List<Price>> getPrices(
            @PathVariable("gameId") String gameId
    ) {
        throw new NotImplementedException();
    }

    @PatchMapping("/{gameId}/prices/{priceId}")
    public ResponseEntity<Price> editPrice(
            @PathVariable("gameId") String gameId,
            @PathVariable("detailId") String priceId,
            @RequestBody Price body,
            @RequestParam("fields") List<String> fields
    ) {
        throw new NotImplementedException();
    }

}
