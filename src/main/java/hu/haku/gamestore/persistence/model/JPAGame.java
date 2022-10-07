package hu.haku.gamestore.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
public class JPAGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JPAGameDetail> gameDetail = new HashSet<>();

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JPAPrice> prices = new HashSet<>();

    @ManyToMany()
    @JoinTable(
            name = "game",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "queryTag_id"))
    private Set<JPAQueryTag> queryTag = new HashSet<>();

    public void addDetail(JPAGameDetail detail) {
        gameDetail.add(detail);
        detail.setGame(this);
    }

    public void addPrice(JPAPrice price) {
        prices.add(price);
        price.setGame(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JPAGame game = (JPAGame) o;
        return id != null && Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
