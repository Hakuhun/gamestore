package hu.haku.gamestore.controller;

import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.GameDetail;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GameControllerValidator {

    public void validateGet(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id is required");
        }
    }

    public void validatePost(Game game) {
        if (StringUtils.isBlank(game.getTitle())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "game.title is required");
        }

        if (StringUtils.isBlank(game.getDescription())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "game.description is required");
        }

        if (CollectionUtils.isEmpty(game.getQueryTag())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "game.queryTags is required");
        }

    }

}
