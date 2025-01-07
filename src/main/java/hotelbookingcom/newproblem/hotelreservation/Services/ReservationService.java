package hotelbookingcom.newproblem.hotelreservation.Services;

import hotelbookingcom.newproblem.hotelreservation.Models.Reservation;
import hotelbookingcom.newproblem.hotelreservation.dtos.ReservationDto;
import hotelbookingcom.newproblem.hotelreservation.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    public List<ReservationDto> getAll() {
        List<Reservation> reservationsList = reservationRepository.findAll();
        List<ReservationDto> reservationDtoList = new ArrayList<>();
        for (Reservation reservation : reservationsList) {
            ReservationDto reservationDto = new ReservationDto();
            reservationDto.setRoomID(reservation.getRoomID());
            reservationDto.setReservationId(reservation.getReservationId());
            reservationDto.setCustomerId(reservation.getCustomerId());
            reservationDto.setCheckInDate(reservation.getCheckInDate());
            reservationDto.setCheckOutDate(reservation.getCheckOutDate());
            reservationDto.setReservationStatus(reservation.getReservationStatus());
            reservationDto.setNumberOfGuests(reservation.getNumberOfGuests());
            reservationDto.setPaymentStatus(reservation.getPaymentStatus());
            reservationDto.setTotalAmount(reservation.getTotalAmount());
            reservationDtoList.add(reservationDto);

        }
        return reservationDtoList;
    }
    public  void save(ReservationDto reservationDto) {
        Reservation reservation = new Reservation();
        reservation.setRoomID(reservationDto.getRoomID());
        reservation.setReservationId(reservationDto.getReservationId());
        reservation.setCustomerId(reservationDto.getCustomerId());
        reservation.setCheckInDate(reservationDto.getCheckInDate());
        reservation.setCheckOutDate(reservationDto.getCheckOutDate());
        reservation.setReservationStatus(reservationDto.getReservationStatus());
        reservation.setNumberOfGuests(reservationDto.getNumberOfGuests());
        reservation.setPaymentStatus(reservationDto.getPaymentStatus());
        reservation.setTotalAmount(reservationDto.getTotalAmount());
        reservationRepository.save(reservation);
    }
}
