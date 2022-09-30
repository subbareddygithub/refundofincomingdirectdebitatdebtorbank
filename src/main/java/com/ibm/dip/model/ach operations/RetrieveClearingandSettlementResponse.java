package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.ach operations.InitiateClearingandSettlementRequestClearingandSettlement;
import com.ibm.dip.model.ach operations.InitiateOutboundACHResponseOutboundACH;
import com.ibm.dip.model.ach operations.UpdateInboundACHRequestInboundACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveClearingandSettlementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class RetrieveClearingandSettlementResponse   {
  @JsonProperty("InboundACH")
  private UpdateInboundACHRequestInboundACH inboundACH;

  @JsonProperty("OutboundACH")
  private InitiateOutboundACHResponseOutboundACH outboundACH;

  @JsonProperty("ClearingandSettlement")
  private InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement;

  public RetrieveClearingandSettlementResponse inboundACH(UpdateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
    return this;
  }

  /**
   * Get inboundACH
   * @return inboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateInboundACHRequestInboundACH getInboundACH() {
    return inboundACH;
  }

  public void setInboundACH(UpdateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
  }

  public RetrieveClearingandSettlementResponse outboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
    return this;
  }

  /**
   * Get outboundACH
   * @return outboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundACHResponseOutboundACH getOutboundACH() {
    return outboundACH;
  }

  public void setOutboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
  }

  public RetrieveClearingandSettlementResponse clearingandSettlement(InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
    return this;
  }

  /**
   * Get clearingandSettlement
   * @return clearingandSettlement
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateClearingandSettlementRequestClearingandSettlement getClearingandSettlement() {
    return clearingandSettlement;
  }

  public void setClearingandSettlement(InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveClearingandSettlementResponse retrieveClearingandSettlementResponse = (RetrieveClearingandSettlementResponse) o;
    return Objects.equals(this.inboundACH, retrieveClearingandSettlementResponse.inboundACH) &&
        Objects.equals(this.outboundACH, retrieveClearingandSettlementResponse.outboundACH) &&
        Objects.equals(this.clearingandSettlement, retrieveClearingandSettlementResponse.clearingandSettlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH, outboundACH, clearingandSettlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveClearingandSettlementResponse {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
    sb.append("    outboundACH: ").append(toIndentedString(outboundACH)).append("\n");
    sb.append("    clearingandSettlement: ").append(toIndentedString(clearingandSettlement)).append("\n");
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

