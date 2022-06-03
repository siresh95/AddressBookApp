package com.bridgelabz.addressbookapp.dto;


public class AddressBookDTO {
    public String city;
    public String state;
    public long pinCode;

    public AddressBookDTO(String city, String state, long pinCode) {
        super();
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "AddressBookDTO [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
    }

}