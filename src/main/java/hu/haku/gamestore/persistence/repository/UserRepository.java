package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<JPAUser,Long> {
    JPAUser findByUsername(String username);
}
