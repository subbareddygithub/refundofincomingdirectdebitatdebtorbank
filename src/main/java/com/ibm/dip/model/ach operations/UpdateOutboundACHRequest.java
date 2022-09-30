package com.ibm.dip.model.ach operations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.ach operations.InitiateInboundACHRequestInboundACH;
import com.ibm.dip.model.ach operations.InitiateOutboundACHResponseOutboundACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateOutboundACHRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:53:42.695Z[GMT]")

public class UpdateOutboundACHRequest   {
  @JsonProperty("InboundACH")
  private InitiateInboundACHRequestInboundACH inboundACH;

  @JsonProperty("OutboundACH")
  private InitiateOutboundACHResponseOutboundACH outboundACH;

  public UpdateOutboundACHRequest inboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
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

  public UpdateOutboundACHRequest outboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOutboundACHRequest updateOutboundACHRequest = (UpdateOutboundACHRequest) o;
    return Objects.equals(this.inboundACH, updateOutboundACHRequest.inboundACH) &&
        Objects.equals(this.outboundACH, updateOutboundACHRequest.outboundACH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH, outboundACH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOutboundACHRequest {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
    sb.append("    outboundACH: ").append(toIndentedString(outboundACH)).append("\n");
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

