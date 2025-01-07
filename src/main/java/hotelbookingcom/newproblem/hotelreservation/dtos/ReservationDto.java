package hotelbookingcom.newproblem.hotelreservation.dtos;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class ReservationDto {
    @NotNull
    @NotNull
    private String reservationId;
    @NotNull
    @NotNull
    private String customerId;
    @NotNull
    @NotNull
    private String roomID;
    @NotNull
    @NotNull
    private Date checkInDate;
    @NotNull
    @NotNull
    private Date checkOutDate;
    @NotNull
    @NotNull
    private int  numberOfGuests;
    @NotNull
    @NotNull
    private String reservationStatus;
    @NotNull
    @NotNull
    private int  totalAmount;
    @NotNull
    @NotNull
    private String paymentStatus;

    public @NotNull @NotNull String getReservationId() {
        return reservationId;
    }

    public void setReservationId(@NotNull @NotNull String reservationId) {
        this.reservationId = reservationId;
    }

    public @NotNull @NotNull String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(@NotNull @NotNull String customerId) {
        this.customerId = customerId;
    }

    public @NotNull @NotNull String getRoomID() {
        return roomID;
    }

    public void setRoomID(@NotNull @NotNull String roomID) {
        this.roomID = roomID;
    }

    public @NotNull @NotNull Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(@NotNull @NotNull Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public @NotNull @NotNull Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(@NotNull @NotNull Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @NotNull
    @NotNull
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(@NotNull @NotNull int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public @NotNull @NotNull String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(@NotNull @NotNull String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @NotNull
    @NotNull
    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(@NotNull @NotNull int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public @NotNull @NotNull String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(@NotNull @NotNull String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
