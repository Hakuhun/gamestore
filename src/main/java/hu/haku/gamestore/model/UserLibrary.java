package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.User;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserLibrary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T15:43:16.448+02:00[Europe/Budapest]")
public class UserLibrary   {

  @JsonProperty("user")
  private User user;

  @JsonProperty("games")
  @Valid
  private List<Game> games = null;

  public UserLibrary user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", required = false)
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserLibrary games(List<Game> games) {
    this.games = games;
    return this;
  }

  public UserLibrary addGamesItem(Game gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

  /**
   * Get games
   * @return games
  */
  @Valid 
  @Schema(name = "games", required = false)
  public List<Game> getGames() {
    return games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibrary userLibrary = (UserLibrary) o;
    return Objects.equals(this.user, userLibrary.user) &&
        Objects.equals(this.games, userLibrary.games);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, games);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibrary {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

