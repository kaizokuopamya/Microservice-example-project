package com.hotel.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.entities.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, Long> {

}
