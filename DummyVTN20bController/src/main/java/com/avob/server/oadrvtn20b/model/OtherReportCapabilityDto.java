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
 * OtherReportCapabilityDto
 */

public class OtherReportCapabilityDto implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("createdDatetime")
  private Long createdDatetime = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("reportId")
  private String reportId = null;

  /**
   * Gets or Sets reportName
   */
  public enum ReportNameEnum {
    @SerializedName("METADATA_HISTORY_USAGE")
    METADATA_HISTORY_USAGE("METADATA_HISTORY_USAGE"),
    
    @SerializedName("HISTORY_USAGE")
    HISTORY_USAGE("HISTORY_USAGE"),
    
    @SerializedName("METADATA_HISTORY_GREENBUTTON")
    METADATA_HISTORY_GREENBUTTON("METADATA_HISTORY_GREENBUTTON"),
    
    @SerializedName("HISTORY_GREENBUTTON")
    HISTORY_GREENBUTTON("HISTORY_GREENBUTTON"),
    
    @SerializedName("METADATA_TELEMETRY_USAGE")
    METADATA_TELEMETRY_USAGE("METADATA_TELEMETRY_USAGE"),
    
    @SerializedName("TELEMETRY_USAGE")
    TELEMETRY_USAGE("TELEMETRY_USAGE"),
    
    @SerializedName("METADATA_TELEMETRY_STATUS")
    METADATA_TELEMETRY_STATUS("METADATA_TELEMETRY_STATUS"),
    
    @SerializedName("TELEMETRY_STATUS")
    TELEMETRY_STATUS("TELEMETRY_STATUS");

    private String value;

    ReportNameEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("reportName")
  private ReportNameEnum reportName = null;

  @SerializedName("reportRequestId")
  private String reportRequestId = null;

  @SerializedName("reportSpecifierId")
  private String reportSpecifierId = null;

  @SerializedName("start")
  private Long start = null;

  @SerializedName("venId")
  private String venId = null;

  public OtherReportCapabilityDto createdDatetime(Long createdDatetime) {
    this.createdDatetime = createdDatetime;
    return this;
  }

   /**
   * Get createdDatetime
   * @return createdDatetime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedDatetime() {
    return createdDatetime;
  }

  public void setCreatedDatetime(Long createdDatetime) {
    this.createdDatetime = createdDatetime;
  }

  public OtherReportCapabilityDto duration(String duration) {
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

  public OtherReportCapabilityDto id(Long id) {
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

  public OtherReportCapabilityDto reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Get reportId
   * @return reportId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public OtherReportCapabilityDto reportName(ReportNameEnum reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportNameEnum getReportName() {
    return reportName;
  }

  public void setReportName(ReportNameEnum reportName) {
    this.reportName = reportName;
  }

  public OtherReportCapabilityDto reportRequestId(String reportRequestId) {
    this.reportRequestId = reportRequestId;
    return this;
  }

   /**
   * Get reportRequestId
   * @return reportRequestId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReportRequestId() {
    return reportRequestId;
  }

  public void setReportRequestId(String reportRequestId) {
    this.reportRequestId = reportRequestId;
  }

  public OtherReportCapabilityDto reportSpecifierId(String reportSpecifierId) {
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

  public OtherReportCapabilityDto start(Long start) {
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

  public OtherReportCapabilityDto venId(String venId) {
    this.venId = venId;
    return this;
  }

   /**
   * Get venId
   * @return venId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVenId() {
    return venId;
  }

  public void setVenId(String venId) {
    this.venId = venId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherReportCapabilityDto otherReportCapabilityDto = (OtherReportCapabilityDto) o;
    return Objects.equals(this.createdDatetime, otherReportCapabilityDto.createdDatetime) &&
        Objects.equals(this.duration, otherReportCapabilityDto.duration) &&
        Objects.equals(this.id, otherReportCapabilityDto.id) &&
        Objects.equals(this.reportId, otherReportCapabilityDto.reportId) &&
        Objects.equals(this.reportName, otherReportCapabilityDto.reportName) &&
        Objects.equals(this.reportRequestId, otherReportCapabilityDto.reportRequestId) &&
        Objects.equals(this.reportSpecifierId, otherReportCapabilityDto.reportSpecifierId) &&
        Objects.equals(this.start, otherReportCapabilityDto.start) &&
        Objects.equals(this.venId, otherReportCapabilityDto.venId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDatetime, duration, id, reportId, reportName, reportRequestId, reportSpecifierId, start, venId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherReportCapabilityDto {\n");
    
    sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportRequestId: ").append(toIndentedString(reportRequestId)).append("\n");
    sb.append("    reportSpecifierId: ").append(toIndentedString(reportSpecifierId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    venId: ").append(toIndentedString(venId)).append("\n");
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

