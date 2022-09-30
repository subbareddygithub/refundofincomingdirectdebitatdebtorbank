package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ACHFulfillmentOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class ACHFulfillmentOperatingSession   {
  @JsonProperty("ACHReference")
  private Object acHReference;

  @JsonProperty("ACHAccessSchedule")
  private String acHAccessSchedule;

  public ACHFulfillmentOperatingSession acHReference(Object acHReference) {
    this.acHReference = acHReference;
    return this;
  }

  /**
   * Get acHReference
   * @return acHReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAcHReference() {
    return acHReference;
  }

  public void setAcHReference(Object acHReference) {
    this.acHReference = acHReference;
  }

  public ACHFulfillmentOperatingSession acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   * Get acHAccessSchedule
   * @return acHAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ACHFulfillmentOperatingSession acHFulfillmentOperatingSession = (ACHFulfillmentOperatingSession) o;
    return Objects.equals(this.acHReference, acHFulfillmentOperatingSession.acHReference) &&
        Objects.equals(this.acHAccessSchedule, acHFulfillmentOperatingSession.acHAccessSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHReference, acHAccessSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ACHFulfillmentOperatingSession {\n");
    
    sb.append("    acHReference: ").append(toIndentedString(acHReference)).append("\n");
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

