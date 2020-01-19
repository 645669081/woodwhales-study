package cn.woodwhales.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PersonDTO {
	
	private String code;
	
	private String name;
	
	private Byte status;
	
	private Date gmtCreated;
	
	private Date gmtModified;
}
