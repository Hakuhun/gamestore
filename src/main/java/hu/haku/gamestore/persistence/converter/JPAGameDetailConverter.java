package hu.haku.gamestore.persistence.converter;

import hu.haku.gamestore.model.business.BGame;
import hu.haku.gamestore.persistence.model.JPAGameDetail;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JPAGameDetailConverter {

    public BGame from(JPAGameDetail source) {
        if (null == source) {
            return null;
        }
        BGame detail = new BGame();
        detail.setTitle(source.getTitle());
        detail.setDescription(source.getDescription());
        detail.setReleaseDate(source.getReleaseDate());
        return detail;
    }

    public JPAGameDetail to(BGame target) {
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
