package com.opp.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpportunityInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T18:28:38.604729300+05:30[Asia/Calcutta]")
public class OpportunityInput {

  private String name;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private String customerId;

  private String status;

  public OpportunityInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OpportunityInput(String name, String description, LocalDate date) {
    this.name = name;
    this.description = description;
    this.date = date;
  }

  public OpportunityInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The title of the opportunity
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The title of the opportunity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpportunityInput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the opportunity
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description of the opportunity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OpportunityInput date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the opportunity
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", description = "The date of the opportunity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public OpportunityInput customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Opportunity should bemapped which customer
   * @return customerId
  */
  
  @Schema(name = "customerId", description = "Opportunity should bemapped which customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OpportunityInput status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status whether opportunity is successful or new or failure in conversion to member
   * @return status
  */
  
  @Schema(name = "status", description = "status whether opportunity is successful or new or failure in conversion to member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpportunityInput opportunityInput = (OpportunityInput) o;
    return Objects.equals(this.name, opportunityInput.name) &&
        Objects.equals(this.description, opportunityInput.description) &&
        Objects.equals(this.date, opportunityInput.date) &&
        Objects.equals(this.customerId, opportunityInput.customerId) &&
        Objects.equals(this.status, opportunityInput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, date, customerId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

