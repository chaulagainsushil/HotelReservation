package hotelbookingcom.newproblem.hotelreservation.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class HotelDto {
    @NotNull
    @NotBlank
    private String hotelId;
    @NotNull
    @NotBlank
    private String hotelName;
    @NotNull
    @NotBlank
    private String hotelAddress;
    @NotNull
    @NotBlank
    private String hotelCity;
    @NotNull
    @NotBlank
    private String hotelState;
    @NotNull
    @NotBlank
    private String hotelCountry;
    @NotNull
    @NotBlank
    private String hotelPhone;
    @NotNull
    @NotBlank
    private String hotelEmail;

    public @NotNull @NotBlank String getHotelId() {
        return hotelId;
    }

    public void setHotelId(@NotNull @NotBlank String hotelId) {
        this.hotelId = hotelId;
    }

    public @NotNull @NotBlank String getHotelName() {
        return hotelName;
    }

    public void setHotelName(@NotNull @NotBlank String hotelName) {
        this.hotelName = hotelName;
    }

    public @NotNull @NotBlank String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(@NotNull @NotBlank String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public @NotNull @NotBlank String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(@NotNull @NotBlank String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public @NotNull @NotBlank String getHotelState() {
        return hotelState;
    }

    public void setHotelState(@NotNull @NotBlank String hotelState) {
        this.hotelState = hotelState;
    }

    public @NotNull @NotBlank String getHotelCountry() {
        return hotelCountry;
    }

    public void setHotelCountry(@NotNull @NotBlank String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    public @NotNull @NotBlank String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(@NotNull @NotBlank String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public @NotNull @NotBlank String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(@NotNull @NotBlank String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }
}
