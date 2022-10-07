package hu.haku.gamestore.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class JPAQueryTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @JsonProperty("name")
    private String name;

    @ManyToMany(mappedBy = "queryTag")
    private Set<JPAGame> game = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JPAQueryTag that = (JPAQueryTag) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
