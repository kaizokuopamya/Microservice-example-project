package com.hotel.service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("hotels")
public class Hotel {
	
	@Id
	private Long id;
	private String name;
	private String location;
	private String about;
	
}
