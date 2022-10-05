package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import hu.haku.gamestore.model.Duration;
import hu.haku.gamestore.model.Game;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-05T23:36:13.557+02:00[Europe/Prague]")
public class GameDetail   {

  @JsonProperty("revisionId")
  private String revisionId;

  @JsonProperty("game")
  private Game game;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ACTIVE("active"),
    
    DEACTIVE("deactive"),
    
    SUSPENDED("suspended");

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

  @JsonProperty("sale")
  private Object sale;

  @JsonProperty("availability")
  private Duration availability;

  public GameDetail revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Get revisionId
   * @return revisionId
  */
  
  @Schema(name = "revisionId", required = false)
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }

  public GameDetail game(Game game) {
    this.game = game;
    return this;
  }

  /**
   * Get game
   * @return game
  */
  @Valid 
  @Schema(name = "game", required = false)
  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public GameDetail state(StateEnum state) {
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

  public GameDetail sale(Object sale) {
    this.sale = sale;
    return this;
  }

  /**
   * Get sale
   * @return sale
  */
  
  @Schema(name = "sale", required = false)
  public Object getSale() {
    return sale;
  }

  public void setSale(Object sale) {
    this.sale = sale;
  }

  public GameDetail availability(Duration availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @Valid 
  @Schema(name = "availability", required = false)
  public Duration getAvailability() {
    return availability;
  }

  public void setAvailability(Duration availability) {
    this.availability = availability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameDetail gameDetail = (GameDetail) o;
    return Objects.equals(this.revisionId, gameDetail.revisionId) &&
        Objects.equals(this.game, gameDetail.game) &&
        Objects.equals(this.state, gameDetail.state) &&
        Objects.equals(this.sale, gameDetail.sale) &&
        Objects.equals(this.availability, gameDetail.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisionId, game, state, sale, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDetail {\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sale: ").append(toIndentedString(sale)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

