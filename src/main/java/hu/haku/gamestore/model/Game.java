/*
 * Simple API
 * A simple API to illustrate OpenAPI concepts
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package hu.haku.gamestore.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Game
 */
@JsonPropertyOrder({
  Game.JSON_PROPERTY_ID,
  Game.JSON_PROPERTY_TITLE,
  Game.JSON_PROPERTY_DESCRIPTION,
  Game.JSON_PROPERTY_QUERY_TAG,
  Game.JSON_PROPERTY_AGE_RESTRICTION,
  Game.JSON_PROPERTY_RELEASE_DATE,
  Game.JSON_PROPERTY_PRICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Game {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_QUERY_TAG = "queryTag";
  private List<QueryTag> queryTag = null;

  public static final String JSON_PROPERTY_AGE_RESTRICTION = "ageRestriction";
  private List<Restriction> ageRestriction = null;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private LocalDate releaseDate;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<Price> prices = null;

  public Game() {
  }

  public Game id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for every game entry. Based on UUID v4 format
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for every game entry. Based on UUID v4 format")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryTag> getQueryTag() {
    return queryTag;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryTag(List<QueryTag> queryTag) {
    this.queryTag = queryTag;
  }


  public Game ageRestriction(List<Restriction> ageRestriction) {
    
    this.ageRestriction = ageRestriction;
    return this;
  }

  public Game addAgeRestrictionItem(Restriction ageRestrictionItem) {
    if (this.ageRestriction == null) {
      this.ageRestriction = new ArrayList<>();
    }
    this.ageRestriction.add(ageRestrictionItem);
    return this;
  }

   /**
   * Get ageRestriction
   * @return ageRestriction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Restriction> getAgeRestriction() {
    return ageRestriction;
  }


  @JsonProperty(JSON_PROPERTY_AGE_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgeRestriction(List<Restriction> ageRestriction) {
    this.ageRestriction = ageRestriction;
  }


  public Game releaseDate(LocalDate releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Price> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.ageRestriction, game.ageRestriction) &&
        Objects.equals(this.releaseDate, game.releaseDate) &&
        Objects.equals(this.prices, game.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, queryTag, ageRestriction, releaseDate, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queryTag: ").append(toIndentedString(queryTag)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
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
