package hu.haku.gamestore.controller;

import hu.haku.gamestore.converter.Converter;
import hu.haku.gamestore.model.GameDetail;
import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.model.business.BGameDetail;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BusinessGameDetailConverter implements Converter<GameDetail, BGameDetail> {

    private final ModelMapper mapper;

    @Override
    public BGameDetail from(GameDetail source) {
        if (null == source) {
            return null;
        }

        return mapper.map(source, BGameDetail.class);
    }

    @Override
    public GameDetail to(BGameDetail target) {
        if (null == target) {
            return null;
        }

        return mapper.map(target, GameDetail.class);
    }

}
