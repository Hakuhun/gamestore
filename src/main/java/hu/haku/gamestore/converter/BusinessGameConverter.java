package hu.haku.gamestore.converter;

import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.model.business.BGameDetail;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class BusinessGameConverter {

    private final ModelMapper mapper;

    public BGame to(Game source) {
        if (null == source)
            return null;

        BGame game = mapper.map(source, BGame.class);
        BGameDetail detail = new BGameDetail();
        detail.setTitle(source.getTitle());
        detail.setDescription(source.getDescription());
        detail.setReleaseDate(Date.from(source.getReleaseDate().atStartOfDay().toInstant(ZoneOffset.UTC)));
        if (CollectionUtils.isEmpty(game.getGameDetail())) {
            game.setGameDetail(Arrays.asList(detail));
        } else {
            //Business error
            game.getGameDetail().add(detail);
        }
        return game;
    }

    public Game from(BGame source) {
        if (null == source)
            return null;

        return mapper.map(source, Game.class);
    }
}
