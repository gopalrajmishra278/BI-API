package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name ="APP_CITIZEN")
@Data
public class ApprovedCitizenEntity {
	@Id
	@GeneratedValue
	private Integer appCitizenId;
	private Long caseNum;
	private String fname;
	private Integer ssn;
	private String planName;
	private Double benefitAmt;
	
}
