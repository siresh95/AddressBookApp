package com.bridgelabz.addressbookapp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookList = new ArrayList<>();
        addressBookList.add(new AddressBookData(1, new AddressBookDTO("Surat", "Gujarat")));
        return addressBookList;
    }

    @Override
    public AddressBookData getAddressByPinCode(int pinCode) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("jammu", "jammu&kashmir"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int pinCode, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int pinCode) {

    }
}