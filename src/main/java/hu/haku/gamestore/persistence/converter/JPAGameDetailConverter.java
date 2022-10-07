package hu.haku.gamestore.persistence.converter;

import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.model.business.BGameDetail;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class JPAGameDetailConverter {

    private final ModelMapper mapper;

    public BGameDetail from(JPAGameDetail source) {
        if (null == source) {
            return null;
        }
        return mapper.map(source, BGameDetail.class);
    }

    public JPAGameDetail to(BGameDetail target) {
        if (!target.hasAnyDetails()) {
            return null;
        }

        JPAGameDetail details = new JPAGameDetail();

        if (StringUtils.isNoneBlank(target.getTitle())) {
            details.setTitle(target.getTitle());
        }

        if (StringUtils.isNoneBlank(target.getDescription())) {
            details.setDescription(target.getDescription());
        }

        if (target.getReleaseDate() != null) {
            details.setReleaseDate(target.getReleaseDate());
        } else {
            details.setReleaseDate(new Date());
        }

        return details;
    }

}
