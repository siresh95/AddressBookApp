package com.bridgelabz.addressbookapp.dto;


public class AddressBookDTO {

    public String state;
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