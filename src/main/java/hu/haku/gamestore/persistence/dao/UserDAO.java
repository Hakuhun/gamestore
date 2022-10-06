package hu.haku.gamestore.persistence.dao;

import hu.haku.gamestore.model.User;
import hu.haku.gamestore.persistence.model.JPARole;
import hu.haku.gamestore.persistence.model.JPAUser;

public interface UserDAO {
    JPAUser saveUser(JPAUser user);
    JPARole saveRole(JPARole role);
    void addRoleToUser(JPAUser user, JPARole role);
}
