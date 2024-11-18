package com.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
	private Long ratingId;
	private Long userId;
	private Long hotelId;
	private int rating;
	private String feedback;
	private Hotel hotel;
}
