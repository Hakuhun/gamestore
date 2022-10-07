package hu.haku.gamestore.persistence.dao;

import hu.haku.gamestore.persistence.model.JPAGame;

public interface GameDAO {

    JPAGame addNewGameEntry(JPAGame game);

}
