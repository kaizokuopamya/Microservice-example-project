package com.hotel.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	HotelRepository hotelRepo;
	
	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(Long id) {
		return hotelRepo.findById(id).orElse(null);
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepo.save(hotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		Hotel updatedHotel = hotelRepo.findById(hotel.getId()).orElse(null);
		return hotelRepo.save(updatedHotel);
	}

	@Override
	public String deletHotel(Long id) {
		hotelRepo.deleteById(id);
		String result = hotelRepo.existsById(id) ? "Id mismatched not able to delete" : "Hotel Successfully Deleted";
		return result;
	}

}
