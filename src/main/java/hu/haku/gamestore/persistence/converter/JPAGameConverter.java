package hu.haku.gamestore.persistence.converter;

import com.google.common.collect.Sets;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.model.business.BGameDetail;
import hu.haku.gamestore.persistence.model.JPAGame;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Component
@RequiredArgsConstructor
public class JPAGameConverter {

    private final JPAPriceConverter priceConverter;
    private final JPAQueryTagConverter tagConverter;
    private final JPAGameDetailConverter detailConverter;

    public JPAGame to(BGame source) {
        if (null == source) {
            return null;
        }

        JPAGame game = new JPAGame();
        game.setGameDetail(new HashSet<>(Sets.newHashSet(detailConverter.to(source.getGameDetail().stream().findFirst().orElseGet(null)))));
        game.getPrices().addAll(new HashSet<>(priceConverter.to(source.getPrices())));
        game.getQueryTag().addAll(new HashSet<>(tagConverter.to(source.getQueryTag())));

        return game;
    }

    public BGame from(JPAGame source) {
        if (null == source) {
            return null;
        }

        BGame game = new BGame();
        BGameDetail gameDetail = detailConverter.from(source.getGameDetail().stream().findAny().orElse(new JPAGameDetail()));
        game.setGameDetail(Arrays.asList(gameDetail));
        game.setId(source.getId().toString());
        game.setQueryTag(new ArrayList<>(tagConverter.from(source.getQueryTag())));
        game.setPrices(new ArrayList<>(priceConverter.from(source.getPrices())));
        return game;
    }

}
