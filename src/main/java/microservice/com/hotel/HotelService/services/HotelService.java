package microservice.com.hotel.HotelService.services;

import microservice.com.hotel.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAllHotel();

    Hotel get(String id);

}
