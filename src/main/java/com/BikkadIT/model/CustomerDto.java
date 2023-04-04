package com.BikkadIT.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CustomerDto {

	private Integer customerId;
	
	private String name;
	
	private Long phoneNo;
	
	private String address;
	
	private String dob;
	
   
	

}
