package hotelbookingcom.newproblem.hotelreservation.Services;

import hotelbookingcom.newproblem.hotelreservation.Models.Rooms;
import hotelbookingcom.newproblem.hotelreservation.dtos.RoomsDto;
import hotelbookingcom.newproblem.hotelreservation.repositories.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoomsService {
    @Autowired
    private RoomsRepository roomsRepository;

    public List<RoomsDto> getall() {
        List<Rooms> roomsList = roomsRepository.findAll();
            List<RoomsDto> roomsDtoList = new ArrayList<>();
        for (Rooms rooms : roomsList) {
            RoomsDto roomsDto = new RoomsDto();
            roomsDto.setRoomId(rooms.getRoomId());
            roomsDto.setRoomType(rooms.getRoomType());
            roomsDto.setRoomNUmber(rooms.getRoomNUmber());
            roomsDto.setFloorNumber(rooms.getFloorNumber());
            roomsDto.setAvailabilityStatus(rooms.getAvailabilityStatus());
            roomsDto.setMaxOccupancy(rooms.getMaxOccupancy());
            roomsDto.setPricePerNight(rooms.getPricePerNight());
            roomsDtoList.add(roomsDto);
        }
        return roomsDtoList;
  }
  public  void save(RoomsDto roomsDto) {
        Rooms rooms = new Rooms();
        rooms.setRoomId(roomsDto.getRoomId());
        rooms.setRoomType(roomsDto.getRoomType());
        rooms.setRoomNUmber(roomsDto.getRoomNUmber());
        rooms.setFloorNumber(roomsDto.getFloorNumber());
        rooms.setAvailabilityStatus(roomsDto.getAvailabilityStatus());
        rooms.setMaxOccupancy(roomsDto.getMaxOccupancy());
        rooms.setPricePerNight(roomsDto.getPricePerNight());
       roomsRepository.save(rooms);
  }
}
