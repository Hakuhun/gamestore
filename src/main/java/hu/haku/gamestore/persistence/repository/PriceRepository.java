package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<JPAPrice, Long> {
}
