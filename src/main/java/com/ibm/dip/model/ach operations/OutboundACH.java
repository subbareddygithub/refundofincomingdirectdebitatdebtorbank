package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OutboundACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class OutboundACH   {
  @JsonProperty("OutboundACHTransactionBatchReference")
  private Object outboundACHTransactionBatchReference;

  public OutboundACH outboundACHTransactionBatchReference(Object outboundACHTransactionBatchReference) {
    this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
    return this;
  }

  /**
   * Get outboundACHTransactionBatchReference
   * @return outboundACHTransactionBatchReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getOutboundACHTransactionBatchReference() {
    return outboundACHTransactionBatchReference;
  }

  public void setOutboundACHTransactionBatchReference(Object outboundACHTransactionBatchReference) {
    this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundACH outboundACH = (OutboundACH) o;
    return Objects.equals(this.outboundACHTransactionBatchReference, outboundACH.outboundACHTransactionBatchReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outboundACHTransactionBatchReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundACH {\n");
    
    sb.append("    outboundACHTransactionBatchReference: ").append(toIndentedString(outboundACHTransactionBatchReference)).append("\n");
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

