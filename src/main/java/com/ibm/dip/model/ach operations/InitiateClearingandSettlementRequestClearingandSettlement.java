package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateClearingandSettlementRequestClearingandSettlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class InitiateClearingandSettlementRequestClearingandSettlement   {
  @JsonProperty("CorrespondentBankReference")
  private Object correspondentBankReference;

  @JsonProperty("CorrespondentBankClearingAgreementReference")
  private Object correspondentBankClearingAgreementReference;

  @JsonProperty("CorrespondentBankClearingAgreementClearingInstructions")
  private String correspondentBankClearingAgreementClearingInstructions;

  @JsonProperty("CorrespondentBankClearingAgreementSettlementInstructions")
  private String correspondentBankClearingAgreementSettlementInstructions;

  @JsonProperty("MirrorNostroAccountReference")
  private Object mirrorNostroAccountReference;

  public InitiateClearingandSettlementRequestClearingandSettlement correspondentBankReference(Object correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
    return this;
  }

  /**
   * Get correspondentBankReference
   * @return correspondentBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentBankReference() {
    return correspondentBankReference;
  }

  public void setCorrespondentBankReference(Object correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
  }

  public InitiateClearingandSettlementRequestClearingandSettlement correspondentBankClearingAgreementReference(Object correspondentBankClearingAgreementReference) {
    this.correspondentBankClearingAgreementReference = correspondentBankClearingAgreementReference;
    return this;
  }

  /**
   * Get correspondentBankClearingAgreementReference
   * @return correspondentBankClearingAgreementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentBankClearingAgreementReference() {
    return correspondentBankClearingAgreementReference;
  }

  public void setCorrespondentBankClearingAgreementReference(Object correspondentBankClearingAgreementReference) {
    this.correspondentBankClearingAgreementReference = correspondentBankClearingAgreementReference;
  }

  public InitiateClearingandSettlementRequestClearingandSettlement correspondentBankClearingAgreementClearingInstructions(String correspondentBankClearingAgreementClearingInstructions) {
    this.correspondentBankClearingAgreementClearingInstructions = correspondentBankClearingAgreementClearingInstructions;
    return this;
  }

  /**
   * Get correspondentBankClearingAgreementClearingInstructions
   * @return correspondentBankClearingAgreementClearingInstructions
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankClearingAgreementClearingInstructions() {
    return correspondentBankClearingAgreementClearingInstructions;
  }

  public void setCorrespondentBankClearingAgreementClearingInstructions(String correspondentBankClearingAgreementClearingInstructions) {
    this.correspondentBankClearingAgreementClearingInstructions = correspondentBankClearingAgreementClearingInstructions;
  }

  public InitiateClearingandSettlementRequestClearingandSettlement correspondentBankClearingAgreementSettlementInstructions(String correspondentBankClearingAgreementSettlementInstructions) {
    this.correspondentBankClearingAgreementSettlementInstructions = correspondentBankClearingAgreementSettlementInstructions;
    return this;
  }

  /**
   * Get correspondentBankClearingAgreementSettlementInstructions
   * @return correspondentBankClearingAgreementSettlementInstructions
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankClearingAgreementSettlementInstructions() {
    return correspondentBankClearingAgreementSettlementInstructions;
  }

  public void setCorrespondentBankClearingAgreementSettlementInstructions(String correspondentBankClearingAgreementSettlementInstructions) {
    this.correspondentBankClearingAgreementSettlementInstructions = correspondentBankClearingAgreementSettlementInstructions;
  }

  public InitiateClearingandSettlementRequestClearingandSettlement mirrorNostroAccountReference(Object mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
    return this;
  }

  /**
   * Get mirrorNostroAccountReference
   * @return mirrorNostroAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(Object mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateClearingandSettlementRequestClearingandSettlement initiateClearingandSettlementRequestClearingandSettlement = (InitiateClearingandSettlementRequestClearingandSettlement) o;
    return Objects.equals(this.correspondentBankReference, initiateClearingandSettlementRequestClearingandSettlement.correspondentBankReference) &&
        Objects.equals(this.correspondentBankClearingAgreementReference, initiateClearingandSettlementRequestClearingandSettlement.correspondentBankClearingAgreementReference) &&
        Objects.equals(this.correspondentBankClearingAgreementClearingInstructions, initiateClearingandSettlementRequestClearingandSettlement.correspondentBankClearingAgreementClearingInstructions) &&
        Objects.equals(this.correspondentBankClearingAgreementSettlementInstructions, initiateClearingandSettlementRequestClearingandSettlement.correspondentBankClearingAgreementSettlementInstructions) &&
        Objects.equals(this.mirrorNostroAccountReference, initiateClearingandSettlementRequestClearingandSettlement.mirrorNostroAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankReference, correspondentBankClearingAgreementReference, correspondentBankClearingAgreementClearingInstructions, correspondentBankClearingAgreementSettlementInstructions, mirrorNostroAccountReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateClearingandSettlementRequestClearingandSettlement {\n");
    
    sb.append("    correspondentBankReference: ").append(toIndentedString(correspondentBankReference)).append("\n");
    sb.append("    correspondentBankClearingAgreementReference: ").append(toIndentedString(correspondentBankClearingAgreementReference)).append("\n");
    sb.append("    correspondentBankClearingAgreementClearingInstructions: ").append(toIndentedString(correspondentBankClearingAgreementClearingInstructions)).append("\n");
    sb.append("    correspondentBankClearingAgreementSettlementInstructions: ").append(toIndentedString(correspondentBankClearingAgreementSettlementInstructions)).append("\n");
    sb.append("    mirrorNostroAccountReference: ").append(toIndentedString(mirrorNostroAccountReference)).append("\n");
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

