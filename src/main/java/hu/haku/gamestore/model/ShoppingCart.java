package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import hu.haku.gamestore.model.Game;
import hu.haku.gamestore.model.Price;
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
 * ShoppingCart
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T15:43:16.448+02:00[Europe/Budapest]")
public class ShoppingCart   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("games")
  @Valid
  private List<Game> games = null;

  @JsonProperty("total")
  private Price total;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    PAID("paid"),
    
    UNPAID("unpaid"),
    
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  public ShoppingCart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for every game entry.
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier for every game entry.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShoppingCart userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", required = false)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ShoppingCart games(List<Game> games) {
    this.games = games;
    return this;
  }

  public ShoppingCart addGamesItem(Game gamesItem) {
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

  public ShoppingCart total(Price total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @Valid 
  @Schema(name = "total", required = false)
  public Price getTotal() {
    return total;
  }

  public void setTotal(Price total) {
    this.total = total;
  }

  public ShoppingCart state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", required = false)
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCart shoppingCart = (ShoppingCart) o;
    return Objects.equals(this.id, shoppingCart.id) &&
        Objects.equals(this.userId, shoppingCart.userId) &&
        Objects.equals(this.games, shoppingCart.games) &&
        Objects.equals(this.total, shoppingCart.total) &&
        Objects.equals(this.state, shoppingCart.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, games, total, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

