package com.klef.ms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_2400032790")
public class CharityEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fundraiserName;
	private Double targetAmount;
	private Double amountRaised;
	private Boolean completed;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getFundraiserName() { return fundraiserName; }
	public void setFundraiserName(String fundraiserName) { this.fundraiserName = fundraiserName; }
	public Double getTargetAmount() { return targetAmount; }
	public void setTargetAmount(Double targetAmount) { this.targetAmount = targetAmount; }
	public Double getAmountRaised() { return amountRaised; }
	public void setAmountRaised(Double amountRaised) { this.amountRaised = amountRaised; }
	public Boolean getCompleted() { return completed; }
	public void setCompleted(Boolean completed) { this.completed = completed; }
}
