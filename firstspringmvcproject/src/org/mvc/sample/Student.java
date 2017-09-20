package org.mvc.sample;



import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {
	
	@Size(min=2 , max=30)
	private String name;
	
	
	@Pattern(regexp="[^0-9]*")
	public String region;
	
	public Date date;
	public Long mobileno;
	
	
	
	
public Long getMobileno() {
		return mobileno;
	} 
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
