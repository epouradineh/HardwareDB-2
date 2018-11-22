package com.adineh.hw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Hardware {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="hwtype")
	private HWType hwtype;
	
	private String brand;
	
	private String model;

	@NotNull(message="Required Value")
	@DecimalMin(value="1",message="Minimun Value is 1")
	private Long numbers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HWType getHwtype() {
		return hwtype;
	}

	public void setHwtype(HWType hwType) {
		this.hwtype = hwType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getNumbers() {
		return numbers;
	}

	public void setNumbers(long l) {
		this.numbers = l;
	}
	
	
	
}
