package hu.haku.gamestore.service;

import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.persistence.converter.*;
import hu.haku.gamestore.persistence.dao.GameDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameDataService gameDataService;
    private final JPAGameConverter gameConverter;
    private final JPAPriceConverter priceConverter;
//    private final JPAQueryTagConverter tagConverter;
//    private final JPARestrictionConverter restrictionConverter;
    private final JPAGameDetailConverter detailConverter;

    public BGame addNewEntry(BGame game) {
        Long persistedGameId = gameDataService.addNewGameEntry(
                detailConverter.to(game),
                priceConverter.to(game.getPrices())
//                tagConverter.to(game.getQueryTag()),
//                restrictionConverter.to(game.getAgeRestriction())
        );
        return gameConverter.from(gameDataService.findGameById(persistedGameId));
    }
}
