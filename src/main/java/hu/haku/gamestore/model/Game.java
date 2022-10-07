package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hu.haku.gamestore.model.Price;
import hu.haku.gamestore.model.QueryTag;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Game
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T03:28:27.739+02:00[Europe/Prague]")
public class Game   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("queryTag")
  @Valid
  private List<QueryTag> queryTag = null;

  @JsonProperty("releaseDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate releaseDate;

  @JsonProperty("prices")
  @Valid
  private List<Price> prices = null;

  public Game id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for every game entry. Based on UUID v4 format
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier for every game entry. Based on UUID v4 format", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Game title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Game description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Game queryTag(List<QueryTag> queryTag) {
    this.queryTag = queryTag;
    return this;
  }

  public Game addQueryTagItem(QueryTag queryTagItem) {
    if (this.queryTag == null) {
      this.queryTag = new ArrayList<>();
    }
    this.queryTag.add(queryTagItem);
    return this;
  }

  /**
   * Get queryTag
   * @return queryTag
  */
  @Valid 
  @Schema(name = "queryTag", required = false)
  public List<QueryTag> getQueryTag() {
    return queryTag;
  }

  public void setQueryTag(List<QueryTag> queryTag) {
    this.queryTag = queryTag;
  }

  public Game releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @Valid 
  @Schema(name = "releaseDate", required = false)
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Game prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public Game addPricesItem(Price pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  @Schema(name = "prices", required = false)
  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.title, game.title) &&
        Objects.equals(this.description, game.description) &&
        Objects.equals(this.queryTag, game.queryTag) &&
        Objects.equals(this.releaseDate, game.releaseDate) &&
        Objects.equals(this.prices, game.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, queryTag, releaseDate, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queryTag: ").append(toIndentedString(queryTag)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

