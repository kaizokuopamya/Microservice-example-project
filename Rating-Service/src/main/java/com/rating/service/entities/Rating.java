package com.rating.service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("ratings")
public class Rating {
	@Id
	private Long ratingId;
	private Long userId;
	private Long hotelId;
	private int rating;
	private String feedback;
}
