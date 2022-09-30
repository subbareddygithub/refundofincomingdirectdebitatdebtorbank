package com.ibm.dip.model.correspondent bank operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondent bank operations.UpdateInboundPaymentsRequestInboundPayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateInboundPaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:36.097Z[GMT]")

public class UpdateInboundPaymentsResponse   {
  @JsonProperty("InboundPayments")
  private UpdateInboundPaymentsRequestInboundPayments inboundPayments;

  public UpdateInboundPaymentsResponse inboundPayments(UpdateInboundPaymentsRequestInboundPayments inboundPayments) {
    this.inboundPayments = inboundPayments;
    return this;
  }

  /**
   * Get inboundPayments
   * @return inboundPayments
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateInboundPaymentsRequestInboundPayments getInboundPayments() {
    return inboundPayments;
  }

  public void setInboundPayments(UpdateInboundPaymentsRequestInboundPayments inboundPayments) {
    this.inboundPayments = inboundPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboundPaymentsResponse updateInboundPaymentsResponse = (UpdateInboundPaymentsResponse) o;
    return Objects.equals(this.inboundPayments, updateInboundPaymentsResponse.inboundPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboundPaymentsResponse {\n");
    
    sb.append("    inboundPayments: ").append(toIndentedString(inboundPayments)).append("\n");
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

