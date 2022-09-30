package com.ibm.dip.model.financial gateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundRequestFinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:39.511Z[GMT]")

public class InitiateInboundRequestFinancialGatewayOperatingSession   {
  @JsonProperty("FinancialGatewayServiceType")
  private String financialGatewayServiceType;

  @JsonProperty("FinancialGatewayServiceSessionStatistics")
  private String financialGatewayServiceSessionStatistics;

  public InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
    return this;
  }

  /**
   * Get financialGatewayServiceType
   * @return financialGatewayServiceType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceType() {
    return financialGatewayServiceType;
  }

  public void setFinancialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
  }

  public InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionStatistics
   * @return financialGatewayServiceSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionStatistics() {
    return financialGatewayServiceSessionStatistics;
  }

  public void setFinancialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundRequestFinancialGatewayOperatingSession initiateInboundRequestFinancialGatewayOperatingSession = (InitiateInboundRequestFinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceType, initiateInboundRequestFinancialGatewayOperatingSession.financialGatewayServiceType) &&
        Objects.equals(this.financialGatewayServiceSessionStatistics, initiateInboundRequestFinancialGatewayOperatingSession.financialGatewayServiceSessionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceType, financialGatewayServiceSessionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundRequestFinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceType: ").append(toIndentedString(financialGatewayServiceType)).append("\n");
    sb.append("    financialGatewayServiceSessionStatistics: ").append(toIndentedString(financialGatewayServiceSessionStatistics)).append("\n");
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

