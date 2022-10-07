package hu.haku.gamestore.model.business;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

@Data
public class BGame {

    private String id;

    private String title;

    private String description;

    private List<BQueryTag> queryTag = null;

    private List<BRestriction> ageRestriction = null;

    private Date releaseDate;

    private List<BPrice> prices = null;

    public boolean hasAnyDetails() {
        return null != releaseDate || StringUtils.isNoneBlank(title) || StringUtils.isNoneBlank(description);
    }
}
