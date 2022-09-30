package com.ibm.dip.model.financial gateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financial gateway.InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialGatewayOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:39.511Z[GMT]")

public class InitiateFinancialGatewayOperatingSessionRequest   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession;

  public InitiateFinancialGatewayOperatingSessionRequest financialGatewayOperatingSession(InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialGatewayOperatingSessionRequest initiateFinancialGatewayOperatingSessionRequest = (InitiateFinancialGatewayOperatingSessionRequest) o;
    return Objects.equals(this.financialGatewayOperatingSession, initiateFinancialGatewayOperatingSessionRequest.financialGatewayOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialGatewayOperatingSessionRequest {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
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

