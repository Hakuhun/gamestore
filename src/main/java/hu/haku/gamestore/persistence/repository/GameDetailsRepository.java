package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAGameDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDetailsRepository extends JpaRepository<JPAGameDetail, Long> {
    boolean existsByTitle(String title);
}
