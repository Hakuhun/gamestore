package hu.haku.gamestore.service;

import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.persistence.converter.JPAGameConverter;
import hu.haku.gamestore.persistence.converter.JPAGameDetailConverter;
import hu.haku.gamestore.persistence.converter.JPAPriceConverter;
import hu.haku.gamestore.persistence.converter.JPAQueryTagConverter;
import hu.haku.gamestore.persistence.dao.GameDataService;
import hu.haku.gamestore.persistence.model.JPAGame;
import hu.haku.gamestore.persistence.model.JPAQueryTag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameDataService gameDataService;
    private final JPAGameConverter gameConverter;
    private final JPAPriceConverter priceConverter;
    private final JPAQueryTagConverter tagConverter;
    private final JPAGameDetailConverter detailConverter;

    public BGame addNewEntry(BGame game) {

        Set<JPAQueryTag> persistedTags = gameDataService.upsertTags(new HashSet<>(tagConverter.to(game.getQueryTag())));

        Long persistedGameId = gameDataService.addNewGameEntry(
                detailConverter.to(game),
                priceConverter.to(game.getPrices()),
                persistedTags
        );
        return gameConverter.from(gameDataService.findGameById(persistedGameId));
    }

    public BGame findGameById(String id) {
        JPAGame game = gameDataService.findGameById(Long.valueOf(id));
        if (null == game) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game with title " + id + "does not exists");
        }
        return gameConverter.from(game);
    }

    public BGame
}
