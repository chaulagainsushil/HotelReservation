package hotelbookingcom.newproblem.hotelreservation.dtos;

import jakarta.validation.constraints.NotBlank;

public class RoomsDto {
    @NotBlank
    @NotBlank
    private String roomId;
   @NotBlank
   @NotBlank
    private String roomNUmber;
    @NotBlank
    @NotBlank
    private String roomType;
    @NotBlank
    @NotBlank
    private String maxOccupancy;
    @NotBlank
    @NotBlank
    private int pricePerNight;
    @NotBlank
    @NotBlank
    private String availabilityStatus;
    @NotBlank
    @NotBlank
    private String floorNumber;

    public @NotBlank @NotBlank String getRoomId() {
        return roomId;
    }

    public void setRoomId(@NotBlank @NotBlank String roomId) {
        this.roomId = roomId;
    }

    public @NotBlank @NotBlank String getRoomNUmber() {
        return roomNUmber;
    }

    public void setRoomNUmber(@NotBlank @NotBlank String roomNUmber) {
        this.roomNUmber = roomNUmber;
    }

    public @NotBlank @NotBlank String getRoomType() {
        return roomType;
    }

    public void setRoomType(@NotBlank @NotBlank String roomType) {
        this.roomType = roomType;
    }

    public @NotBlank @NotBlank String getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(@NotBlank @NotBlank String maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    @NotBlank
    @NotBlank
    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(@NotBlank @NotBlank int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public @NotBlank @NotBlank String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(@NotBlank @NotBlank String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public @NotBlank @NotBlank String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(@NotBlank @NotBlank String floorNumber) {
        this.floorNumber = floorNumber;
    }
}
