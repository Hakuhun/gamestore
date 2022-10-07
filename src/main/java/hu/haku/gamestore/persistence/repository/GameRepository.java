package hu.haku.gamestore.persistence.repository;

import hu.haku.gamestore.persistence.model.JPAGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.Collection;

public interface GameRepository extends JpaRepository<JPAGame, Long> {
    Page<JPAGame> findByGameDetail_TitleAndGameDetail_ActiveTrueAndQueryTag_NameInAllIgnoreCase(@Nullable String title, @Nullable Collection<String> names, Pageable pageable);

}
