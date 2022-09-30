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
 * NotifyOutboundPaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:36.097Z[GMT]")

public class NotifyOutboundPaymentsResponse   {
  @JsonProperty("OutboundPayments")
  private UpdateInboundPaymentsRequestInboundPayments outboundPayments;

  public NotifyOutboundPaymentsResponse outboundPayments(UpdateInboundPaymentsRequestInboundPayments outboundPayments) {
    this.outboundPayments = outboundPayments;
    return this;
  }

  /**
   * Get outboundPayments
   * @return outboundPayments
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateInboundPaymentsRequestInboundPayments getOutboundPayments() {
    return outboundPayments;
  }

  public void setOutboundPayments(UpdateInboundPaymentsRequestInboundPayments outboundPayments) {
    this.outboundPayments = outboundPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyOutboundPaymentsResponse notifyOutboundPaymentsResponse = (NotifyOutboundPaymentsResponse) o;
    return Objects.equals(this.outboundPayments, notifyOutboundPaymentsResponse.outboundPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outboundPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyOutboundPaymentsResponse {\n");
    
    sb.append("    outboundPayments: ").append(toIndentedString(outboundPayments)).append("\n");
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

