package hu.haku.gamestore.model.business;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

@Data
public class BGameDetail {
    private String id;
    private String title;
    private String description;
    private Date releaseDate;

    public boolean hasAnyDetails() {
        return null != releaseDate || StringUtils.isNoneBlank(title) || StringUtils.isNoneBlank(description);
    }
}
