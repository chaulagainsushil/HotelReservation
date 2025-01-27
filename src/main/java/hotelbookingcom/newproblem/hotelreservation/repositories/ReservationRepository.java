package hotelbookingcom.newproblem.hotelreservation.repositories;

import hotelbookingcom.newproblem.hotelreservation.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
