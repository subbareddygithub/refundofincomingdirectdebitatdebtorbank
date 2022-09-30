package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateInboundACHRequestInboundACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class UpdateInboundACHRequestInboundACH   {
  @JsonProperty("InboundACHTransactionBatchReference")
  private Object inboundACHTransactionBatchReference;

  @JsonProperty("ACHPaymentTransactionReference")
  private Object acHPaymentTransactionReference;

  @JsonProperty("ACHPaymentTransactionRecord")
  private String acHPaymentTransactionRecord;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private Object paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private Object payerReference;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference;

  @JsonProperty("PayeeReference")
  private Object payeeReference;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference;

  @JsonProperty("SpecialInstructions")
  private String specialInstructions;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  public UpdateInboundACHRequestInboundACH inboundACHTransactionBatchReference(Object inboundACHTransactionBatchReference) {
    this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
    return this;
  }

  /**
   * Get inboundACHTransactionBatchReference
   * @return inboundACHTransactionBatchReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundACHTransactionBatchReference() {
    return inboundACHTransactionBatchReference;
  }

  public void setInboundACHTransactionBatchReference(Object inboundACHTransactionBatchReference) {
    this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
  }

  public UpdateInboundACHRequestInboundACH acHPaymentTransactionReference(Object acHPaymentTransactionReference) {
    this.acHPaymentTransactionReference = acHPaymentTransactionReference;
    return this;
  }

  /**
   * Get acHPaymentTransactionReference
   * @return acHPaymentTransactionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAcHPaymentTransactionReference() {
    return acHPaymentTransactionReference;
  }

  public void setAcHPaymentTransactionReference(Object acHPaymentTransactionReference) {
    this.acHPaymentTransactionReference = acHPaymentTransactionReference;
  }

  public UpdateInboundACHRequestInboundACH acHPaymentTransactionRecord(String acHPaymentTransactionRecord) {
    this.acHPaymentTransactionRecord = acHPaymentTransactionRecord;
    return this;
  }

  /**
   * Get acHPaymentTransactionRecord
   * @return acHPaymentTransactionRecord
  */
  @ApiModelProperty(value = "")


  public String getAcHPaymentTransactionRecord() {
    return acHPaymentTransactionRecord;
  }

  public void setAcHPaymentTransactionRecord(String acHPaymentTransactionRecord) {
    this.acHPaymentTransactionRecord = acHPaymentTransactionRecord;
  }

  public UpdateInboundACHRequestInboundACH paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public UpdateInboundACHRequestInboundACH payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public UpdateInboundACHRequestInboundACH payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public UpdateInboundACHRequestInboundACH payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public UpdateInboundACHRequestInboundACH payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public UpdateInboundACHRequestInboundACH payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public UpdateInboundACHRequestInboundACH payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public UpdateInboundACHRequestInboundACH specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

  /**
   * Get specialInstructions
   * @return specialInstructions
  */
  @ApiModelProperty(value = "")


  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  public UpdateInboundACHRequestInboundACH amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public UpdateInboundACHRequestInboundACH currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public UpdateInboundACHRequestInboundACH dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboundACHRequestInboundACH updateInboundACHRequestInboundACH = (UpdateInboundACHRequestInboundACH) o;
    return Objects.equals(this.inboundACHTransactionBatchReference, updateInboundACHRequestInboundACH.inboundACHTransactionBatchReference) &&
        Objects.equals(this.acHPaymentTransactionReference, updateInboundACHRequestInboundACH.acHPaymentTransactionReference) &&
        Objects.equals(this.acHPaymentTransactionRecord, updateInboundACHRequestInboundACH.acHPaymentTransactionRecord) &&
        Objects.equals(this.paymentTransactionInitiatorReference, updateInboundACHRequestInboundACH.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, updateInboundACHRequestInboundACH.payerReference) &&
        Objects.equals(this.payerBankReference, updateInboundACHRequestInboundACH.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, updateInboundACHRequestInboundACH.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, updateInboundACHRequestInboundACH.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, updateInboundACHRequestInboundACH.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, updateInboundACHRequestInboundACH.payeeBankReference) &&
        Objects.equals(this.specialInstructions, updateInboundACHRequestInboundACH.specialInstructions) &&
        Objects.equals(this.amount, updateInboundACHRequestInboundACH.amount) &&
        Objects.equals(this.currency, updateInboundACHRequestInboundACH.currency) &&
        Objects.equals(this.dateType, updateInboundACHRequestInboundACH.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACHTransactionBatchReference, acHPaymentTransactionReference, acHPaymentTransactionRecord, paymentTransactionInitiatorReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, amount, currency, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboundACHRequestInboundACH {\n");
    
    sb.append("    inboundACHTransactionBatchReference: ").append(toIndentedString(inboundACHTransactionBatchReference)).append("\n");
    sb.append("    acHPaymentTransactionReference: ").append(toIndentedString(acHPaymentTransactionReference)).append("\n");
    sb.append("    acHPaymentTransactionRecord: ").append(toIndentedString(acHPaymentTransactionRecord)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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
