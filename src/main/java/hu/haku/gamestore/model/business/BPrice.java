package hu.haku.gamestore.model.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BPrice {
    private String currency;

    private double netPrice;

    private double grossPrice;

    private String region;

    private String sale;

    private boolean onSale;
}
