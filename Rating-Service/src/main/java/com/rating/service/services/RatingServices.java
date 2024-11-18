package com.rating.service.services;

import java.util.List;

import com.rating.service.entities.Rating;

public interface RatingServices {
	List<Rating> getAllRatings();

	Rating addRating(Rating rating);

	List<Rating> getByUserId(Long userId);

	List<Rating> getByHotelId(Long hotelId);

}
