package com.ibm.dip.model.correspondent bank operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondent bank operations.InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession;
import com.ibm.dip.model.correspondent bank operations.UpdateInboundPaymentsRequestInboundPayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInboundPaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:36.097Z[GMT]")

public class RetrieveInboundPaymentsResponse   {
  @JsonProperty("CorrespondentBankOperatingSession")
  private InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession;

  @JsonProperty("InboundPayments")
  private UpdateInboundPaymentsRequestInboundPayments inboundPayments;

  public RetrieveInboundPaymentsResponse correspondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession) {
    this.correspondentBankOperatingSession = correspondentBankOperatingSession;
    return this;
  }

  /**
   * Get correspondentBankOperatingSession
   * @return correspondentBankOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession getCorrespondentBankOperatingSession() {
    return correspondentBankOperatingSession;
  }

  public void setCorrespondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession) {
    this.correspondentBankOperatingSession = correspondentBankOperatingSession;
  }

  public RetrieveInboundPaymentsResponse inboundPayments(UpdateInboundPaymentsRequestInboundPayments inboundPayments) {
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
    RetrieveInboundPaymentsResponse retrieveInboundPaymentsResponse = (RetrieveInboundPaymentsResponse) o;
    return Objects.equals(this.correspondentBankOperatingSession, retrieveInboundPaymentsResponse.correspondentBankOperatingSession) &&
        Objects.equals(this.inboundPayments, retrieveInboundPaymentsResponse.inboundPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankOperatingSession, inboundPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInboundPaymentsResponse {\n");
    
    sb.append("    correspondentBankOperatingSession: ").append(toIndentedString(correspondentBankOperatingSession)).append("\n");
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

