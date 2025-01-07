package hotelbookingcom.newproblem.hotelreservation.repositories;

import hotelbookingcom.newproblem.hotelreservation.Models.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, String> {

}
