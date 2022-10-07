package hu.haku.gamestore.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JPARestriction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String region;

    private int minimumAge;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private JPAGame game;
}
