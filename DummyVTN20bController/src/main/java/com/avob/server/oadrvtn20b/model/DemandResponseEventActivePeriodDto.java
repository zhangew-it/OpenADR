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
 * DemandResponseEventActivePeriodDto
 */

public class DemandResponseEventActivePeriodDto implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("notificationDuration")
  private String notificationDuration = null;

  @SerializedName("rampUpDuration")
  private String rampUpDuration = null;

  @SerializedName("recoveryDuration")
  private String recoveryDuration = null;

  @SerializedName("start")
  private Long start = null;

  @SerializedName("toleranceDuration")
  private String toleranceDuration = null;

  public DemandResponseEventActivePeriodDto duration(String duration) {
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

  public DemandResponseEventActivePeriodDto notificationDuration(String notificationDuration) {
    this.notificationDuration = notificationDuration;
    return this;
  }

   /**
   * Get notificationDuration
   * @return notificationDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNotificationDuration() {
    return notificationDuration;
  }

  public void setNotificationDuration(String notificationDuration) {
    this.notificationDuration = notificationDuration;
  }

  public DemandResponseEventActivePeriodDto rampUpDuration(String rampUpDuration) {
    this.rampUpDuration = rampUpDuration;
    return this;
  }

   /**
   * Get rampUpDuration
   * @return rampUpDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRampUpDuration() {
    return rampUpDuration;
  }

  public void setRampUpDuration(String rampUpDuration) {
    this.rampUpDuration = rampUpDuration;
  }

  public DemandResponseEventActivePeriodDto recoveryDuration(String recoveryDuration) {
    this.recoveryDuration = recoveryDuration;
    return this;
  }

   /**
   * Get recoveryDuration
   * @return recoveryDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecoveryDuration() {
    return recoveryDuration;
  }

  public void setRecoveryDuration(String recoveryDuration) {
    this.recoveryDuration = recoveryDuration;
  }

  public DemandResponseEventActivePeriodDto start(Long start) {
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

  public DemandResponseEventActivePeriodDto toleranceDuration(String toleranceDuration) {
    this.toleranceDuration = toleranceDuration;
    return this;
  }

   /**
   * Get toleranceDuration
   * @return toleranceDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToleranceDuration() {
    return toleranceDuration;
  }

  public void setToleranceDuration(String toleranceDuration) {
    this.toleranceDuration = toleranceDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandResponseEventActivePeriodDto demandResponseEventActivePeriodDto = (DemandResponseEventActivePeriodDto) o;
    return Objects.equals(this.duration, demandResponseEventActivePeriodDto.duration) &&
        Objects.equals(this.notificationDuration, demandResponseEventActivePeriodDto.notificationDuration) &&
        Objects.equals(this.rampUpDuration, demandResponseEventActivePeriodDto.rampUpDuration) &&
        Objects.equals(this.recoveryDuration, demandResponseEventActivePeriodDto.recoveryDuration) &&
        Objects.equals(this.start, demandResponseEventActivePeriodDto.start) &&
        Objects.equals(this.toleranceDuration, demandResponseEventActivePeriodDto.toleranceDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, notificationDuration, rampUpDuration, recoveryDuration, start, toleranceDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandResponseEventActivePeriodDto {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    notificationDuration: ").append(toIndentedString(notificationDuration)).append("\n");
    sb.append("    rampUpDuration: ").append(toIndentedString(rampUpDuration)).append("\n");
    sb.append("    recoveryDuration: ").append(toIndentedString(recoveryDuration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    toleranceDuration: ").append(toIndentedString(toleranceDuration)).append("\n");
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

