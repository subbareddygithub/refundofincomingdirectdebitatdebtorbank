package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.ach operations.InitiateInboundACHRequestInboundACH;
import com.ibm.dip.model.ach operations.InitiateOutboundACHResponseOutboundACH;
import com.ibm.dip.model.ach operations.InitiateWarehousingRequestWarehousing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateWarehousingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class InitiateWarehousingRequest   {
  @JsonProperty("InboundACH")
  private InitiateInboundACHRequestInboundACH inboundACH;

  @JsonProperty("OutboundACH")
  private InitiateOutboundACHResponseOutboundACH outboundACH;

  @JsonProperty("Warehousing")
  private InitiateWarehousingRequestWarehousing warehousing;

  public InitiateWarehousingRequest inboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
    return this;
  }

  /**
   * Get inboundACH
   * @return inboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundACHRequestInboundACH getInboundACH() {
    return inboundACH;
  }

  public void setInboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
  }

  public InitiateWarehousingRequest outboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
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

  public InitiateWarehousingRequest warehousing(InitiateWarehousingRequestWarehousing warehousing) {
    this.warehousing = warehousing;
    return this;
  }

  /**
   * Get warehousing
   * @return warehousing
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateWarehousingRequestWarehousing getWarehousing() {
    return warehousing;
  }

  public void setWarehousing(InitiateWarehousingRequestWarehousing warehousing) {
    this.warehousing = warehousing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateWarehousingRequest initiateWarehousingRequest = (InitiateWarehousingRequest) o;
    return Objects.equals(this.inboundACH, initiateWarehousingRequest.inboundACH) &&
        Objects.equals(this.outboundACH, initiateWarehousingRequest.outboundACH) &&
        Objects.equals(this.warehousing, initiateWarehousingRequest.warehousing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH, outboundACH, warehousing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateWarehousingRequest {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
    sb.append("    outboundACH: ").append(toIndentedString(outboundACH)).append("\n");
    sb.append("    warehousing: ").append(toIndentedString(warehousing)).append("\n");
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

