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
 * VenCreateDto
 */

public class VenCreateDto implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("authenticationType")
  private String authenticationType = null;

  @SerializedName("commonName")
  private String commonName = null;

  @SerializedName("httpPullModel")
  private Boolean httpPullModel = null;

  @SerializedName("needCertificateGeneration")
  private String needCertificateGeneration = null;

  @SerializedName("oadrName")
  private String oadrName = null;

  @SerializedName("oadrProfil")
  private String oadrProfil = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("pushUrl")
  private String pushUrl = null;

  @SerializedName("reportOnly")
  private Boolean reportOnly = null;

  @SerializedName("transport")
  private String transport = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("xmlSignature")
  private Boolean xmlSignature = null;

  public VenCreateDto authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public VenCreateDto commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public VenCreateDto httpPullModel(Boolean httpPullModel) {
    this.httpPullModel = httpPullModel;
    return this;
  }

   /**
   * Get httpPullModel
   * @return httpPullModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHttpPullModel() {
    return httpPullModel;
  }

  public void setHttpPullModel(Boolean httpPullModel) {
    this.httpPullModel = httpPullModel;
  }

  public VenCreateDto needCertificateGeneration(String needCertificateGeneration) {
    this.needCertificateGeneration = needCertificateGeneration;
    return this;
  }

   /**
   * Get needCertificateGeneration
   * @return needCertificateGeneration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNeedCertificateGeneration() {
    return needCertificateGeneration;
  }

  public void setNeedCertificateGeneration(String needCertificateGeneration) {
    this.needCertificateGeneration = needCertificateGeneration;
  }

  public VenCreateDto oadrName(String oadrName) {
    this.oadrName = oadrName;
    return this;
  }

   /**
   * Get oadrName
   * @return oadrName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOadrName() {
    return oadrName;
  }

  public void setOadrName(String oadrName) {
    this.oadrName = oadrName;
  }

  public VenCreateDto oadrProfil(String oadrProfil) {
    this.oadrProfil = oadrProfil;
    return this;
  }

   /**
   * Get oadrProfil
   * @return oadrProfil
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOadrProfil() {
    return oadrProfil;
  }

  public void setOadrProfil(String oadrProfil) {
    this.oadrProfil = oadrProfil;
  }

  public VenCreateDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VenCreateDto pushUrl(String pushUrl) {
    this.pushUrl = pushUrl;
    return this;
  }

   /**
   * Get pushUrl
   * @return pushUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPushUrl() {
    return pushUrl;
  }

  public void setPushUrl(String pushUrl) {
    this.pushUrl = pushUrl;
  }

  public VenCreateDto reportOnly(Boolean reportOnly) {
    this.reportOnly = reportOnly;
    return this;
  }

   /**
   * Get reportOnly
   * @return reportOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReportOnly() {
    return reportOnly;
  }

  public void setReportOnly(Boolean reportOnly) {
    this.reportOnly = reportOnly;
  }

  public VenCreateDto transport(String transport) {
    this.transport = transport;
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTransport() {
    return transport;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }

  public VenCreateDto username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public VenCreateDto xmlSignature(Boolean xmlSignature) {
    this.xmlSignature = xmlSignature;
    return this;
  }

   /**
   * Get xmlSignature
   * @return xmlSignature
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getXmlSignature() {
    return xmlSignature;
  }

  public void setXmlSignature(Boolean xmlSignature) {
    this.xmlSignature = xmlSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VenCreateDto venCreateDto = (VenCreateDto) o;
    return Objects.equals(this.authenticationType, venCreateDto.authenticationType) &&
        Objects.equals(this.commonName, venCreateDto.commonName) &&
        Objects.equals(this.httpPullModel, venCreateDto.httpPullModel) &&
        Objects.equals(this.needCertificateGeneration, venCreateDto.needCertificateGeneration) &&
        Objects.equals(this.oadrName, venCreateDto.oadrName) &&
        Objects.equals(this.oadrProfil, venCreateDto.oadrProfil) &&
        Objects.equals(this.password, venCreateDto.password) &&
        Objects.equals(this.pushUrl, venCreateDto.pushUrl) &&
        Objects.equals(this.reportOnly, venCreateDto.reportOnly) &&
        Objects.equals(this.transport, venCreateDto.transport) &&
        Objects.equals(this.username, venCreateDto.username) &&
        Objects.equals(this.xmlSignature, venCreateDto.xmlSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, commonName, httpPullModel, needCertificateGeneration, oadrName, oadrProfil, password, pushUrl, reportOnly, transport, username, xmlSignature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VenCreateDto {\n");
    
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    httpPullModel: ").append(toIndentedString(httpPullModel)).append("\n");
    sb.append("    needCertificateGeneration: ").append(toIndentedString(needCertificateGeneration)).append("\n");
    sb.append("    oadrName: ").append(toIndentedString(oadrName)).append("\n");
    sb.append("    oadrProfil: ").append(toIndentedString(oadrProfil)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pushUrl: ").append(toIndentedString(pushUrl)).append("\n");
    sb.append("    reportOnly: ").append(toIndentedString(reportOnly)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    xmlSignature: ").append(toIndentedString(xmlSignature)).append("\n");
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

