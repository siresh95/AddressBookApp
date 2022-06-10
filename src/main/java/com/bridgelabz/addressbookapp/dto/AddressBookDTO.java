package com.bridgelabz.addressbookapp.dto;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "Invalid State name")
    public String state;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{3,}$", message = "Invalid city name")
    public String city;

    public AddressBookDTO(String state, String city) {
        super();

        this.state = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressBookDTO [state=" + state + ", city=" + city + "]";
    }

}