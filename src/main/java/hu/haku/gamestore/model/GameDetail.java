package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * GameDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T15:43:16.448+02:00[Europe/Budapest]")
public class GameDetail   {

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

  @JsonProperty("active")
  private Boolean active;

  public GameDetail id(String id) {
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

  public GameDetail title(String title) {
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

  public GameDetail description(String description) {
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

  public GameDetail queryTag(List<QueryTag> queryTag) {
    this.queryTag = queryTag;
    return this;
  }

  public GameDetail addQueryTagItem(QueryTag queryTagItem) {
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

  public GameDetail releaseDate(LocalDate releaseDate) {
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

  public GameDetail active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
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
    return Objects.equals(this.id, gameDetail.id) &&
        Objects.equals(this.title, gameDetail.title) &&
        Objects.equals(this.description, gameDetail.description) &&
        Objects.equals(this.queryTag, gameDetail.queryTag) &&
        Objects.equals(this.releaseDate, gameDetail.releaseDate) &&
        Objects.equals(this.active, gameDetail.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, queryTag, releaseDate, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queryTag: ").append(toIndentedString(queryTag)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

