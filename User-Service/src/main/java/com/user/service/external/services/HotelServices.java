package com.user.service.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.entities.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelServices {
	
	@GetMapping("hotels/{hotelId}")
	Hotel getHotel(@PathVariable Long hotelId);
}
