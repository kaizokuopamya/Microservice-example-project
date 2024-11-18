package com.rating.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.service.entities.Rating;
import com.rating.service.services.RatingServices;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingServices ratingService;

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings() {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatings());
	}

	@PostMapping
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.addRating(rating));
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable Long userId) {
		return ResponseEntity.ok(ratingService.getByUserId(userId));
	}

	@GetMapping("hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable Long hotelId) {
		return ResponseEntity.ok(ratingService.getByHotelId(hotelId));
	}
}
