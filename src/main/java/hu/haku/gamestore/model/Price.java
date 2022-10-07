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
 * Price
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T03:28:27.739+02:00[Europe/Prague]")
public class Price   {

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("netPrice")
  private BigDecimal netPrice;

  @JsonProperty("grossPrice")
  private BigDecimal grossPrice;

  @JsonProperty("region")
  private String region;

  @JsonProperty("sale")
  private String sale;

  @JsonProperty("onSale")
  private Boolean onSale;

  @JsonProperty("active")
  private Boolean active;

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", required = false)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Price netPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
    return this;
  }

  /**
   * Get netPrice
   * @return netPrice
  */
  @Valid 
  @Schema(name = "netPrice", required = false)
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public Price grossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
    return this;
  }

  /**
   * Get grossPrice
   * @return grossPrice
  */
  @Valid 
  @Schema(name = "grossPrice", required = false)
  public BigDecimal getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
  }

  public Price region(String region) {
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

  public Price sale(String sale) {
    this.sale = sale;
    return this;
  }

  /**
   * Get sale
   * @return sale
  */
  
  @Schema(name = "sale", required = false)
  public String getSale() {
    return sale;
  }

  public void setSale(String sale) {
    this.sale = sale;
  }

  public Price onSale(Boolean onSale) {
    this.onSale = onSale;
    return this;
  }

  /**
   * Get onSale
   * @return onSale
  */
  
  @Schema(name = "onSale", required = false)
  public Boolean getOnSale() {
    return onSale;
  }

  public void setOnSale(Boolean onSale) {
    this.onSale = onSale;
  }

  public Price active(Boolean active) {
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
    Price price = (Price) o;
    return Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.netPrice, price.netPrice) &&
        Objects.equals(this.grossPrice, price.grossPrice) &&
        Objects.equals(this.region, price.region) &&
        Objects.equals(this.sale, price.sale) &&
        Objects.equals(this.onSale, price.onSale) &&
        Objects.equals(this.active, price.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, netPrice, grossPrice, region, sale, onSale, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sale: ").append(toIndentedString(sale)).append("\n");
    sb.append("    onSale: ").append(toIndentedString(onSale)).append("\n");
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

