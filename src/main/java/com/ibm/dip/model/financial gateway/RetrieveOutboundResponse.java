package com.ibm.dip.model.financial gateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financial gateway.InitiateInboundRequestFinancialGatewayOperatingSession;
import com.ibm.dip.model.financial gateway.InitiateOutboundRequestOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOutboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:39.511Z[GMT]")

public class RetrieveOutboundResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundRequestOutbound outbound;

  public RetrieveOutboundResponse financialGatewayOperatingSession(InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }

  public RetrieveOutboundResponse outbound(InitiateOutboundRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundRequestOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundRequestOutbound outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOutboundResponse retrieveOutboundResponse = (RetrieveOutboundResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, retrieveOutboundResponse.financialGatewayOperatingSession) &&
        Objects.equals(this.outbound, retrieveOutboundResponse.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOutboundResponse {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

