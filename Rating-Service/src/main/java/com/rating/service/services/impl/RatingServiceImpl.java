package com.rating.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.service.entities.Rating;
import com.rating.service.repository.RatingRepository;
import com.rating.service.services.RatingServices;

@Service
public class RatingServiceImpl implements RatingServices{
	
	@Autowired
	RatingRepository ratingRepo;
	
	@Override
	public List<Rating> getAllRatings() {
		return ratingRepo.findAll();
	}

	@Override
	public Rating addRating(Rating rating) {
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getByUserId(Long userId) {
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(Long hotelId) {
		return ratingRepo.findByHotelId(hotelId);
	}

}
