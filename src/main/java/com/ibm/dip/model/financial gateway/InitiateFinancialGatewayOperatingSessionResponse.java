package com.ibm.dip.model.financial gateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financial gateway.InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialGatewayOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:39.511Z[GMT]")

public class InitiateFinancialGatewayOperatingSessionResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession;

  public InitiateFinancialGatewayOperatingSessionResponse financialGatewayOperatingSession(InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
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
    InitiateFinancialGatewayOperatingSessionResponse initiateFinancialGatewayOperatingSessionResponse = (InitiateFinancialGatewayOperatingSessionResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, initiateFinancialGatewayOperatingSessionResponse.financialGatewayOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialGatewayOperatingSessionResponse {\n");
    
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

