package com.BikkadIT.email;

import lombok.*;

import javax.persistence.Entity;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
		
	    private Integer id;
		
		private String to;
		
		private String from;
		
		private String subject;
		
		private String content;

		private String filename;


		
	}



