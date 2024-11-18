package com.hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entities.Hotel;
import com.hotel.service.services.HotelService;

@RestController
@RequestMapping("hotels")
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotels(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(id));
	}
	
	@PostMapping
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.addHotel(hotel));
	}
	
	@PutMapping
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.updateHotel(hotel));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHotel(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.deletHotel(id));
	}
	
	
}
