package hu.haku.gamestore.persistence.dao;

import hu.haku.gamestore.persistence.model.JPAGame;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import hu.haku.gamestore.persistence.model.JPAPrice;
import hu.haku.gamestore.persistence.model.JPAQueryTag;
import hu.haku.gamestore.persistence.repository.GameDetailsRepository;
import hu.haku.gamestore.persistence.repository.GameRepository;
import hu.haku.gamestore.persistence.repository.PriceRepository;
import hu.haku.gamestore.persistence.repository.QueryTagRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
@Log4j2
public class GameDataService {

    private final GameRepository gameRepository;
    private final PriceRepository priceRepository;
    private final GameDetailsRepository detailsRepository;
    private final QueryTagRepository queryTagRepository;

    //@Transactional
    public Long addNewGameEntry(JPAGameDetail detail, Collection<JPAPrice> prices, Collection<JPAQueryTag> tags) {
        if (null == detail) {
            return null;
        }

        if (detailsRepository.existsByTitle(detail.getTitle())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Game with title " + detail.getTitle() + " already exists");
        }

        JPAGame game = new JPAGame();
        game.addDetail(detail);
        prices.forEach(game::addPrice);
        game.getQueryTag().addAll(tags);
        tags.forEach(tag -> tag.getGame().add(game));
        return gameRepository.save(game).getId();
    }

    public Set<JPAQueryTag> upsertTags(Set<JPAQueryTag> tags) {
        Set<JPAQueryTag> persistedTags = new HashSet<>();
        //Save the previously not existent tags and returns the already existing ones.
        tags.stream().filter(tag -> StringUtils.isNoneBlank(tag.getName())).forEach(tag -> {
            if (!queryTagRepository.existsByName(tag.getName())) {
                persistedTags.add(queryTagRepository.save(tag));
            } else{
                persistedTags.add(queryTagRepository.getByName(tag.getName()));
            }
        });

        return persistedTags;
    }

    public JPAGame findGameById(Long id) {
        return gameRepository.getById(id);
    }
}
