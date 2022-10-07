package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<JPAGame, Long> {
}
