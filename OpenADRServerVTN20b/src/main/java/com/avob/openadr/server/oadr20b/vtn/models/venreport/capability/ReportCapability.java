package com.avob.openadr.server.oadr20b.vtn.models.venreport.capability;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.avob.openadr.model.oadr20b.ei.ReportNameEnumeratedType;

/**
 * 
 * @author bzanni
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ReportCapability {

	/**
	 * Autogenerated unique id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(unique = true)
	private String reportSpecifierId;

	private String reportRequestId;

	@Enumerated(EnumType.STRING)
	private ReportNameEnumeratedType reportName;

	private String duration;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReportSpecifierId() {
		return reportSpecifierId;
	}

	public void setReportSpecifierId(String reportSpecifierId) {
		this.reportSpecifierId = reportSpecifierId;
	}

	public ReportNameEnumeratedType getReportName() {
		return reportName;
	}

	public void setReportName(ReportNameEnumeratedType reportName) {
		this.reportName = reportName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getReportRequestId() {
		return reportRequestId;
	}

	public void setReportRequestId(String reportRequestId) {
		this.reportRequestId = reportRequestId;
	}

}
