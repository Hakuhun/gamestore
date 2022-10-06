package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPARole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<JPARole, Long> {
}
