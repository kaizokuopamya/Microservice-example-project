package com.rating.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rating.service.entities.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, Long>{
	List<Rating> findByUserId(Long userId);
	
	List<Rating> findByHotelId(Long hotelId);
}
