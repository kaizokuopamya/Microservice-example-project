package com.hotel.service.services;

import java.util.List;

import com.hotel.service.entities.Hotel;

public interface HotelService {
	List<Hotel> getAllHotels();
	
	Hotel getHotel(Long id);
	
	Hotel addHotel(Hotel hotel);
	
	Hotel updateHotel(Hotel hotel);
	
	String deletHotel(Long id);
	
}
