package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
    public long pinCode;
    public String city;
    public String state;

    public AddressBookData(long pinCode, AddressBookDTO addressbookDTO) {

        this.pinCode = pinCode;
        this.state = addressbookDTO.state;
        this.city = addressbookDTO.city;

    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}