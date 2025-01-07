package hotelbookingcom.newproblem.hotelreservation.Services;

import hotelbookingcom.newproblem.hotelreservation.Models.Hotel;
import hotelbookingcom.newproblem.hotelreservation.dtos.HotelDto;
import hotelbookingcom.newproblem.hotelreservation.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    public List<HotelDto> getAllHotels() {
        List<Hotel> hotelList = hotelRepository.findAll();
        List<HotelDto> hotelDtoList = new ArrayList<>();
        for(Hotel hotel : hotelList) {
            HotelDto hotelDto = new HotelDto();
            hotelDto.setHotelId(hotel.getHotelId());
            hotelDto.setHotelName(hotel.getHotelName());
            hotelDto.setHotelAddress(hotel.getHotelAddress());
            hotelDto.setHotelCity(hotel.getHotelCity());
            hotelDto.setHotelState(hotel.getHotelState());
            hotelDto.setHotelCountry(hotel.getHotelCountry());
            hotelDto.setHotelEmail(hotel.getHotelEmail());
            hotelDto.setHotelPhone(hotel.getHotelPhone());
            hotelDtoList.add(hotelDto);
        }
        return hotelDtoList;
    }
    public void save(HotelDto hotelDto){
        Hotel hotel = new Hotel();
        hotel.setHotelId(hotelDto.getHotelId());
        hotel.setHotelName(hotelDto.getHotelName());
        hotel.setHotelAddress(hotelDto.getHotelAddress());
        hotel.setHotelCity(hotelDto.getHotelCity());
        hotel.setHotelState(hotelDto.getHotelState());
        hotel.setHotelCountry(hotelDto.getHotelCountry());
        hotel.setHotelEmail(hotelDto.getHotelEmail());
        hotel.setHotelPhone(hotelDto.getHotelPhone());
        hotelRepository.save(hotel);
    }
}
