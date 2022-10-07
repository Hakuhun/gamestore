package hu.haku.gamestore.persistence.converter;

import com.google.common.collect.Sets;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.persistence.model.JPAGame;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JPAGameConverter {

    private final JPAPriceConverter priceConverter;
    private final JPAQueryTagConverter tagConverter;
    //private final JPARestrictionConverter restrictionConverter;
    private final JPAGameDetailConverter detailConverter;

    public JPAGame to(BGame source) {
        if (null == source) {
            return null;
        }

        JPAGame game = new JPAGame();
        game.setGameDetail(new HashSet<>(Sets.newHashSet(detailConverter.to(source))));
        game.getPrices().addAll(new HashSet<>(priceConverter.to(source.getPrices())));

        return game;
    }

    public BGame from(JPAGame source) {
        if (null == source) {
            return null;
        }

        BGame game = detailConverter.from(source.getGameDetail().stream().findAny().orElse(new JPAGameDetail()));
        game.setId(source.getId().toString());
        game.setPrices(new ArrayList<>(priceConverter.from(source.getPrices())));
        return game;
    }

}
