/*
 * Avob VTN Rest API
 * Description
 *
 * OpenAPI spec version: API TOS
 * Contact: bzanni@avob.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.avob.server.oadrvtn20b.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * OtherReportDataPayloadResourceStatusDto
 */

public class OtherReportDataPayloadResourceStatusDto implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("accuracy")
  private Float accuracy = null;

  @SerializedName("confidence")
  private Long confidence = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("oadrCapacityCurrent")
  private Float oadrCapacityCurrent = null;

  @SerializedName("oadrCapacityMax")
  private Float oadrCapacityMax = null;

  @SerializedName("oadrCapacityMin")
  private Float oadrCapacityMin = null;

  @SerializedName("oadrCapacityNormal")
  private Float oadrCapacityNormal = null;

  @SerializedName("oadrLevelOffsetCurrent")
  private Float oadrLevelOffsetCurrent = null;

  @SerializedName("oadrLevelOffsetMax")
  private Float oadrLevelOffsetMax = null;

  @SerializedName("oadrLevelOffsetMin")
  private Float oadrLevelOffsetMin = null;

  @SerializedName("oadrLevelOffsetNormal")
  private Float oadrLevelOffsetNormal = null;

  @SerializedName("oadrPercentOffsetCurrent")
  private Float oadrPercentOffsetCurrent = null;

  @SerializedName("oadrPercentOffsetMax")
  private Float oadrPercentOffsetMax = null;

  @SerializedName("oadrPercentOffsetMin")
  private Float oadrPercentOffsetMin = null;

  @SerializedName("oadrPercentOffsetNormal")
  private Float oadrPercentOffsetNormal = null;

  @SerializedName("oadrSetPointCurrent")
  private Float oadrSetPointCurrent = null;

  @SerializedName("oadrSetPointMax")
  private Float oadrSetPointMax = null;

  @SerializedName("oadrSetPointMin")
  private Float oadrSetPointMin = null;

  @SerializedName("oadrSetPointNormal")
  private Float oadrSetPointNormal = null;

  @SerializedName("reportSpecifierId")
  private String reportSpecifierId = null;

  @SerializedName("rid")
  private String rid = null;

  @SerializedName("start")
  private Long start = null;

  public OtherReportDataPayloadResourceStatusDto accuracy(Float accuracy) {
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Float accuracy) {
    this.accuracy = accuracy;
  }

  public OtherReportDataPayloadResourceStatusDto confidence(Long confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getConfidence() {
    return confidence;
  }

  public void setConfidence(Long confidence) {
    this.confidence = confidence;
  }

  public OtherReportDataPayloadResourceStatusDto duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public OtherReportDataPayloadResourceStatusDto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OtherReportDataPayloadResourceStatusDto oadrCapacityCurrent(Float oadrCapacityCurrent) {
    this.oadrCapacityCurrent = oadrCapacityCurrent;
    return this;
  }

   /**
   * Get oadrCapacityCurrent
   * @return oadrCapacityCurrent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrCapacityCurrent() {
    return oadrCapacityCurrent;
  }

  public void setOadrCapacityCurrent(Float oadrCapacityCurrent) {
    this.oadrCapacityCurrent = oadrCapacityCurrent;
  }

  public OtherReportDataPayloadResourceStatusDto oadrCapacityMax(Float oadrCapacityMax) {
    this.oadrCapacityMax = oadrCapacityMax;
    return this;
  }

   /**
   * Get oadrCapacityMax
   * @return oadrCapacityMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrCapacityMax() {
    return oadrCapacityMax;
  }

  public void setOadrCapacityMax(Float oadrCapacityMax) {
    this.oadrCapacityMax = oadrCapacityMax;
  }

  public OtherReportDataPayloadResourceStatusDto oadrCapacityMin(Float oadrCapacityMin) {
    this.oadrCapacityMin = oadrCapacityMin;
    return this;
  }

   /**
   * Get oadrCapacityMin
   * @return oadrCapacityMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrCapacityMin() {
    return oadrCapacityMin;
  }

  public void setOadrCapacityMin(Float oadrCapacityMin) {
    this.oadrCapacityMin = oadrCapacityMin;
  }

  public OtherReportDataPayloadResourceStatusDto oadrCapacityNormal(Float oadrCapacityNormal) {
    this.oadrCapacityNormal = oadrCapacityNormal;
    return this;
  }

   /**
   * Get oadrCapacityNormal
   * @return oadrCapacityNormal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrCapacityNormal() {
    return oadrCapacityNormal;
  }

  public void setOadrCapacityNormal(Float oadrCapacityNormal) {
    this.oadrCapacityNormal = oadrCapacityNormal;
  }

  public OtherReportDataPayloadResourceStatusDto oadrLevelOffsetCurrent(Float oadrLevelOffsetCurrent) {
    this.oadrLevelOffsetCurrent = oadrLevelOffsetCurrent;
    return this;
  }

   /**
   * Get oadrLevelOffsetCurrent
   * @return oadrLevelOffsetCurrent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrLevelOffsetCurrent() {
    return oadrLevelOffsetCurrent;
  }

  public void setOadrLevelOffsetCurrent(Float oadrLevelOffsetCurrent) {
    this.oadrLevelOffsetCurrent = oadrLevelOffsetCurrent;
  }

  public OtherReportDataPayloadResourceStatusDto oadrLevelOffsetMax(Float oadrLevelOffsetMax) {
    this.oadrLevelOffsetMax = oadrLevelOffsetMax;
    return this;
  }

   /**
   * Get oadrLevelOffsetMax
   * @return oadrLevelOffsetMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrLevelOffsetMax() {
    return oadrLevelOffsetMax;
  }

  public void setOadrLevelOffsetMax(Float oadrLevelOffsetMax) {
    this.oadrLevelOffsetMax = oadrLevelOffsetMax;
  }

  public OtherReportDataPayloadResourceStatusDto oadrLevelOffsetMin(Float oadrLevelOffsetMin) {
    this.oadrLevelOffsetMin = oadrLevelOffsetMin;
    return this;
  }

   /**
   * Get oadrLevelOffsetMin
   * @return oadrLevelOffsetMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrLevelOffsetMin() {
    return oadrLevelOffsetMin;
  }

  public void setOadrLevelOffsetMin(Float oadrLevelOffsetMin) {
    this.oadrLevelOffsetMin = oadrLevelOffsetMin;
  }

  public OtherReportDataPayloadResourceStatusDto oadrLevelOffsetNormal(Float oadrLevelOffsetNormal) {
    this.oadrLevelOffsetNormal = oadrLevelOffsetNormal;
    return this;
  }

   /**
   * Get oadrLevelOffsetNormal
   * @return oadrLevelOffsetNormal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrLevelOffsetNormal() {
    return oadrLevelOffsetNormal;
  }

  public void setOadrLevelOffsetNormal(Float oadrLevelOffsetNormal) {
    this.oadrLevelOffsetNormal = oadrLevelOffsetNormal;
  }

  public OtherReportDataPayloadResourceStatusDto oadrPercentOffsetCurrent(Float oadrPercentOffsetCurrent) {
    this.oadrPercentOffsetCurrent = oadrPercentOffsetCurrent;
    return this;
  }

   /**
   * Get oadrPercentOffsetCurrent
   * @return oadrPercentOffsetCurrent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrPercentOffsetCurrent() {
    return oadrPercentOffsetCurrent;
  }

  public void setOadrPercentOffsetCurrent(Float oadrPercentOffsetCurrent) {
    this.oadrPercentOffsetCurrent = oadrPercentOffsetCurrent;
  }

  public OtherReportDataPayloadResourceStatusDto oadrPercentOffsetMax(Float oadrPercentOffsetMax) {
    this.oadrPercentOffsetMax = oadrPercentOffsetMax;
    return this;
  }

   /**
   * Get oadrPercentOffsetMax
   * @return oadrPercentOffsetMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrPercentOffsetMax() {
    return oadrPercentOffsetMax;
  }

  public void setOadrPercentOffsetMax(Float oadrPercentOffsetMax) {
    this.oadrPercentOffsetMax = oadrPercentOffsetMax;
  }

  public OtherReportDataPayloadResourceStatusDto oadrPercentOffsetMin(Float oadrPercentOffsetMin) {
    this.oadrPercentOffsetMin = oadrPercentOffsetMin;
    return this;
  }

   /**
   * Get oadrPercentOffsetMin
   * @return oadrPercentOffsetMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrPercentOffsetMin() {
    return oadrPercentOffsetMin;
  }

  public void setOadrPercentOffsetMin(Float oadrPercentOffsetMin) {
    this.oadrPercentOffsetMin = oadrPercentOffsetMin;
  }

  public OtherReportDataPayloadResourceStatusDto oadrPercentOffsetNormal(Float oadrPercentOffsetNormal) {
    this.oadrPercentOffsetNormal = oadrPercentOffsetNormal;
    return this;
  }

   /**
   * Get oadrPercentOffsetNormal
   * @return oadrPercentOffsetNormal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrPercentOffsetNormal() {
    return oadrPercentOffsetNormal;
  }

  public void setOadrPercentOffsetNormal(Float oadrPercentOffsetNormal) {
    this.oadrPercentOffsetNormal = oadrPercentOffsetNormal;
  }

  public OtherReportDataPayloadResourceStatusDto oadrSetPointCurrent(Float oadrSetPointCurrent) {
    this.oadrSetPointCurrent = oadrSetPointCurrent;
    return this;
  }

   /**
   * Get oadrSetPointCurrent
   * @return oadrSetPointCurrent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrSetPointCurrent() {
    return oadrSetPointCurrent;
  }

  public void setOadrSetPointCurrent(Float oadrSetPointCurrent) {
    this.oadrSetPointCurrent = oadrSetPointCurrent;
  }

  public OtherReportDataPayloadResourceStatusDto oadrSetPointMax(Float oadrSetPointMax) {
    this.oadrSetPointMax = oadrSetPointMax;
    return this;
  }

   /**
   * Get oadrSetPointMax
   * @return oadrSetPointMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrSetPointMax() {
    return oadrSetPointMax;
  }

  public void setOadrSetPointMax(Float oadrSetPointMax) {
    this.oadrSetPointMax = oadrSetPointMax;
  }

  public OtherReportDataPayloadResourceStatusDto oadrSetPointMin(Float oadrSetPointMin) {
    this.oadrSetPointMin = oadrSetPointMin;
    return this;
  }

   /**
   * Get oadrSetPointMin
   * @return oadrSetPointMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrSetPointMin() {
    return oadrSetPointMin;
  }

  public void setOadrSetPointMin(Float oadrSetPointMin) {
    this.oadrSetPointMin = oadrSetPointMin;
  }

  public OtherReportDataPayloadResourceStatusDto oadrSetPointNormal(Float oadrSetPointNormal) {
    this.oadrSetPointNormal = oadrSetPointNormal;
    return this;
  }

   /**
   * Get oadrSetPointNormal
   * @return oadrSetPointNormal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getOadrSetPointNormal() {
    return oadrSetPointNormal;
  }

  public void setOadrSetPointNormal(Float oadrSetPointNormal) {
    this.oadrSetPointNormal = oadrSetPointNormal;
  }

  public OtherReportDataPayloadResourceStatusDto reportSpecifierId(String reportSpecifierId) {
    this.reportSpecifierId = reportSpecifierId;
    return this;
  }

   /**
   * Get reportSpecifierId
   * @return reportSpecifierId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReportSpecifierId() {
    return reportSpecifierId;
  }

  public void setReportSpecifierId(String reportSpecifierId) {
    this.reportSpecifierId = reportSpecifierId;
  }

  public OtherReportDataPayloadResourceStatusDto rid(String rid) {
    this.rid = rid;
    return this;
  }

   /**
   * Get rid
   * @return rid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRid() {
    return rid;
  }

  public void setRid(String rid) {
    this.rid = rid;
  }

  public OtherReportDataPayloadResourceStatusDto start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherReportDataPayloadResourceStatusDto otherReportDataPayloadResourceStatusDto = (OtherReportDataPayloadResourceStatusDto) o;
    return Objects.equals(this.accuracy, otherReportDataPayloadResourceStatusDto.accuracy) &&
        Objects.equals(this.confidence, otherReportDataPayloadResourceStatusDto.confidence) &&
        Objects.equals(this.duration, otherReportDataPayloadResourceStatusDto.duration) &&
        Objects.equals(this.id, otherReportDataPayloadResourceStatusDto.id) &&
        Objects.equals(this.oadrCapacityCurrent, otherReportDataPayloadResourceStatusDto.oadrCapacityCurrent) &&
        Objects.equals(this.oadrCapacityMax, otherReportDataPayloadResourceStatusDto.oadrCapacityMax) &&
        Objects.equals(this.oadrCapacityMin, otherReportDataPayloadResourceStatusDto.oadrCapacityMin) &&
        Objects.equals(this.oadrCapacityNormal, otherReportDataPayloadResourceStatusDto.oadrCapacityNormal) &&
        Objects.equals(this.oadrLevelOffsetCurrent, otherReportDataPayloadResourceStatusDto.oadrLevelOffsetCurrent) &&
        Objects.equals(this.oadrLevelOffsetMax, otherReportDataPayloadResourceStatusDto.oadrLevelOffsetMax) &&
        Objects.equals(this.oadrLevelOffsetMin, otherReportDataPayloadResourceStatusDto.oadrLevelOffsetMin) &&
        Objects.equals(this.oadrLevelOffsetNormal, otherReportDataPayloadResourceStatusDto.oadrLevelOffsetNormal) &&
        Objects.equals(this.oadrPercentOffsetCurrent, otherReportDataPayloadResourceStatusDto.oadrPercentOffsetCurrent) &&
        Objects.equals(this.oadrPercentOffsetMax, otherReportDataPayloadResourceStatusDto.oadrPercentOffsetMax) &&
        Objects.equals(this.oadrPercentOffsetMin, otherReportDataPayloadResourceStatusDto.oadrPercentOffsetMin) &&
        Objects.equals(this.oadrPercentOffsetNormal, otherReportDataPayloadResourceStatusDto.oadrPercentOffsetNormal) &&
        Objects.equals(this.oadrSetPointCurrent, otherReportDataPayloadResourceStatusDto.oadrSetPointCurrent) &&
        Objects.equals(this.oadrSetPointMax, otherReportDataPayloadResourceStatusDto.oadrSetPointMax) &&
        Objects.equals(this.oadrSetPointMin, otherReportDataPayloadResourceStatusDto.oadrSetPointMin) &&
        Objects.equals(this.oadrSetPointNormal, otherReportDataPayloadResourceStatusDto.oadrSetPointNormal) &&
        Objects.equals(this.reportSpecifierId, otherReportDataPayloadResourceStatusDto.reportSpecifierId) &&
        Objects.equals(this.rid, otherReportDataPayloadResourceStatusDto.rid) &&
        Objects.equals(this.start, otherReportDataPayloadResourceStatusDto.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, confidence, duration, id, oadrCapacityCurrent, oadrCapacityMax, oadrCapacityMin, oadrCapacityNormal, oadrLevelOffsetCurrent, oadrLevelOffsetMax, oadrLevelOffsetMin, oadrLevelOffsetNormal, oadrPercentOffsetCurrent, oadrPercentOffsetMax, oadrPercentOffsetMin, oadrPercentOffsetNormal, oadrSetPointCurrent, oadrSetPointMax, oadrSetPointMin, oadrSetPointNormal, reportSpecifierId, rid, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherReportDataPayloadResourceStatusDto {\n");
    
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oadrCapacityCurrent: ").append(toIndentedString(oadrCapacityCurrent)).append("\n");
    sb.append("    oadrCapacityMax: ").append(toIndentedString(oadrCapacityMax)).append("\n");
    sb.append("    oadrCapacityMin: ").append(toIndentedString(oadrCapacityMin)).append("\n");
    sb.append("    oadrCapacityNormal: ").append(toIndentedString(oadrCapacityNormal)).append("\n");
    sb.append("    oadrLevelOffsetCurrent: ").append(toIndentedString(oadrLevelOffsetCurrent)).append("\n");
    sb.append("    oadrLevelOffsetMax: ").append(toIndentedString(oadrLevelOffsetMax)).append("\n");
    sb.append("    oadrLevelOffsetMin: ").append(toIndentedString(oadrLevelOffsetMin)).append("\n");
    sb.append("    oadrLevelOffsetNormal: ").append(toIndentedString(oadrLevelOffsetNormal)).append("\n");
    sb.append("    oadrPercentOffsetCurrent: ").append(toIndentedString(oadrPercentOffsetCurrent)).append("\n");
    sb.append("    oadrPercentOffsetMax: ").append(toIndentedString(oadrPercentOffsetMax)).append("\n");
    sb.append("    oadrPercentOffsetMin: ").append(toIndentedString(oadrPercentOffsetMin)).append("\n");
    sb.append("    oadrPercentOffsetNormal: ").append(toIndentedString(oadrPercentOffsetNormal)).append("\n");
    sb.append("    oadrSetPointCurrent: ").append(toIndentedString(oadrSetPointCurrent)).append("\n");
    sb.append("    oadrSetPointMax: ").append(toIndentedString(oadrSetPointMax)).append("\n");
    sb.append("    oadrSetPointMin: ").append(toIndentedString(oadrSetPointMin)).append("\n");
    sb.append("    oadrSetPointNormal: ").append(toIndentedString(oadrSetPointNormal)).append("\n");
    sb.append("    reportSpecifierId: ").append(toIndentedString(reportSpecifierId)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

