package com.adineh.hw.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="hardware_usage")
public class Hardware_usage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	private Long hardware_id;
	
	@Enumerated(EnumType.STRING)
	private Department department;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date usage_date;
	
	@NotNull(message="Reequired Value")
	@DecimalMin(value="1",message="Minimun Value is 1")
	private Long numbers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHardware_id() {
		return hardware_id;
	}

	public void setHardware_id(Long hardware_id) {
		this.hardware_id = hardware_id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getUsage_date() {
		return usage_date;
	}

	public void setUsage_date(Date usage_date) {
		this.usage_date = usage_date;
	}

	public Long getNumbers() {
		return numbers;
	}

	public void setNumbers(Long numbers) {
		this.numbers = numbers;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hardware_usage [id=" + id + ", hardware=" + hardware_id + ", department=" + department + ", usage_date="
				+ usage_date + ", numbers=" + numbers + "]";
	}
	
	
}
