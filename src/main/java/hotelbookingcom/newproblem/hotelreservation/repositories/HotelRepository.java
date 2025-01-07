package hotelbookingcom.newproblem.hotelreservation.repositories;

import hotelbookingcom.newproblem.hotelreservation.Models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  HotelRepository extends JpaRepository<Hotel, String > {

}
