package hu.haku.gamestore.service;

import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.persistence.converter.JPAGameConverter;
import hu.haku.gamestore.persistence.converter.JPAGameDetailConverter;
import hu.haku.gamestore.persistence.converter.JPAPriceConverter;
import hu.haku.gamestore.persistence.converter.JPAQueryTagConverter;
import hu.haku.gamestore.persistence.dao.GameDataService;
import hu.haku.gamestore.persistence.model.JPAQueryTag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
}
