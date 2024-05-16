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
 * Opportunity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T18:28:38.604729300+05:30[Asia/Calcutta]")
public class Opportunity {

  private String id;

  private String name;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createdDate;

  private String createdBy;

  private String assignedTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate closedDate;

  private String customerId;

  private String status;

  public Opportunity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Opportunity(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public Opportunity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the opportunity
   * @return id
  */
  
  @Schema(name = "id", description = "The unique identifier for the opportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Opportunity name(String name) {
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

  public Opportunity description(String description) {
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

  public Opportunity createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date of the opportunity
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", description = "The date of the opportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public Opportunity createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * user/agent who created this opportunity
   * @return createdBy
  */
  
  @Schema(name = "createdBy", description = "user/agent who created this opportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Opportunity assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * user/agent assigned to this opportunity
   * @return assignedTo
  */
  
  @Schema(name = "assignedTo", description = "user/agent assigned to this opportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public Opportunity closedDate(LocalDate closedDate) {
    this.closedDate = closedDate;
    return this;
  }

  /**
   * the date opportunity got closed
   * @return closedDate
  */
  @Valid 
  @Schema(name = "closedDate", description = "the date opportunity got closed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedDate")
  public LocalDate getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(LocalDate closedDate) {
    this.closedDate = closedDate;
  }

  public Opportunity customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * opportunity is for which customer
   * @return customerId
  */
  
  @Schema(name = "customerId", description = "opportunity is for which customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Opportunity status(String status) {
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
    Opportunity opportunity = (Opportunity) o;
    return Objects.equals(this.id, opportunity.id) &&
        Objects.equals(this.name, opportunity.name) &&
        Objects.equals(this.description, opportunity.description) &&
        Objects.equals(this.createdDate, opportunity.createdDate) &&
        Objects.equals(this.createdBy, opportunity.createdBy) &&
        Objects.equals(this.assignedTo, opportunity.assignedTo) &&
        Objects.equals(this.closedDate, opportunity.closedDate) &&
        Objects.equals(this.customerId, opportunity.customerId) &&
        Objects.equals(this.status, opportunity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, createdDate, createdBy, assignedTo, closedDate, customerId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opportunity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
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

