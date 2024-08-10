package microservice.com.hotel.HotelService.repository;

import microservice.com.hotel.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
