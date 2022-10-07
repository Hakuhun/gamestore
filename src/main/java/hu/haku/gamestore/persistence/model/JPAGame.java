package hu.haku.gamestore.persistence.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(exclude = "gameDetail, prices")
@Entity
public class JPAGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<JPARestriction> ageRestriction = new HashSet<>();

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JPAGameDetail> gameDetail = new HashSet<>();
//
//    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<JPAQueryTag> queryTag = new HashSet<>();

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JPAPrice> prices = new HashSet<>();

    public void addDetail(JPAGameDetail detail) {
        gameDetail.add(detail);
        detail.setGame(this);
    }

    public void addPrice(JPAPrice price) {
        prices.add(price);
        price.setGame(this);
    }

//    public void addTag(JPAQueryTag tag){
//        queryTag.add(tag);
//        tag.setGame(this);
//    }
//
//    public void addRestriction(JPARestriction restriction){
//        ageRestriction.add(restriction);
//        restriction.setGame(this);
//    }
}
