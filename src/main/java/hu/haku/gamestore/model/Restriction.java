package hu.haku.gamestore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Restriction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-05T23:36:13.557+02:00[Europe/Prague]")
public class Restriction   {

  @JsonProperty("region")
  private String region;

  @JsonProperty("minimumAge")
  private BigDecimal minimumAge;

  public Restriction region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "region", required = false)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Restriction minimumAge(BigDecimal minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

  /**
   * Get minimumAge
   * @return minimumAge
  */
  @Valid 
  @Schema(name = "minimumAge", required = false)
  public BigDecimal getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(BigDecimal minimumAge) {
    this.minimumAge = minimumAge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restriction restriction = (Restriction) o;
    return Objects.equals(this.region, restriction.region) &&
        Objects.equals(this.minimumAge, restriction.minimumAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, minimumAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restriction {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
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

