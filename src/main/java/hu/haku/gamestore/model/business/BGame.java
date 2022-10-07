package hu.haku.gamestore.model.business;

import hu.haku.gamestore.persistence.model.JPAGameDetail;
import lombok.Data;

import java.util.List;

@Data
public class BGame {

    private String id;

    private List<BGameDetail> gameDetail;

    private List<BQueryTag> queryTag;

    private List<BPrice> prices;

}
