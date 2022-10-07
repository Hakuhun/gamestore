package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAQueryTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryTagRepository extends JpaRepository<JPAQueryTag, Long> {
    boolean existsByName(String name);
    JPAQueryTag getByName(String name);
}
