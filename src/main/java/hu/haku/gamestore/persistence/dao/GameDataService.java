package hu.haku.gamestore.persistence.dao;

import hu.haku.gamestore.persistence.model.JPAGame;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import hu.haku.gamestore.persistence.model.JPAPrice;
import hu.haku.gamestore.persistence.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Transactional
@Log4j2
public class GameDataService {

    private final GameRepository gameRepository;
    private final PriceRepository priceRepository;
    private final GameDetailsRepository detailsRepository;
//    private final RestrictionRepository restrictionRepository;
//    private final QueryTagRepository queryTagRepository;

    //@Transactional
    public Long addNewGameEntry(JPAGameDetail detail, Collection<JPAPrice> prices) {
        if (null == detail) {
            return null;
        }

        if (detailsRepository.existsByTitle(detail.getTitle())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Game with title " + detail.getTitle() + " already exists");
        }

        JPAGame game = new JPAGame();
        game.addDetail(detail);
        prices.forEach(game::addPrice);
//        tags.forEach(game::addTag);
//        restrictions.forEach(game::addRestriction);
        return gameRepository.save(game).getId();
    }

    public JPAGame findGameById(Long id) {
        return gameRepository.getById(id);
    }
}
