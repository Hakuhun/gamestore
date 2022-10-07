package hu.haku.gamestore.converter;

import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.business.BGame;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BusinessGameConverter {

    private final ModelMapper mapper;

    public BGame to(Game source) {
        if (null == source)
            return null;

        return mapper.map(source, BGame.class);
    }

    public Game from(BGame source) {
        if (null == source)
            return null;

        return mapper.map(source, Game.class);
    }
}
