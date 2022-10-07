package hu.haku.gamestore.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude="game")
@Entity
public class JPAPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    private String currency;

    private double netPrice;

    private double grossPrice;
    @Column(name = "region", nullable = false)
    private String region;

    private String sale;
    @Column(name = "onSale", nullable = false)
    private boolean onSale;
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private JPAGame game;
}
