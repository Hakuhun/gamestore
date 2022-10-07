package hu.haku.gamestore.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JPAQueryTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @JsonProperty("name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private JPAGame game;
}
