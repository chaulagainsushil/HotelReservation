package hotelbookingcom.newproblem.hotelreservation.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class CustomerDto {
    @NotBlank
    @NotNull
    private String CustomerID ;
    @NotBlank
    @NotNull
    private String FirstName ;
    @NotBlank
    @NotNull
    private String  LastName;
    @NotBlank
    @NotNull
    private String Email;
    @NotBlank
    @NotNull
    private String PhoneNumber;
    @NotBlank
    @NotNull
    private String Address;
    @NotBlank
    @NotNull
    private Date DateOfBirth;
    @NotBlank
    @NotNull
    private String Nationality;

    public @NotBlank @NotNull String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(@NotBlank @NotNull String customerID) {
        CustomerID = customerID;
    }

    public @NotBlank @NotNull String getFirstName() {
        return FirstName;
    }

    public void setFirstName(@NotBlank @NotNull String firstName) {
        FirstName = firstName;
    }

    public @NotBlank @NotNull String getLastName() {
        return LastName;
    }

    public void setLastName(@NotBlank @NotNull String lastName) {
        LastName = lastName;
    }

    public @NotBlank @NotNull String getEmail() {
        return Email;
    }

    public void setEmail(@NotBlank @NotNull String email) {
        Email = email;
    }

    public @NotBlank @NotNull String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(@NotBlank @NotNull String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public @NotBlank @NotNull String getAddress() {
        return Address;
    }

    public void setAddress(@NotBlank @NotNull String address) {
        Address = address;
    }

    public @NotBlank @NotNull Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(@NotBlank @NotNull Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public @NotBlank @NotNull String getNationality() {
        return Nationality;
    }

    public void setNationality(@NotBlank @NotNull String nationality) {
        Nationality = nationality;
    }
}
