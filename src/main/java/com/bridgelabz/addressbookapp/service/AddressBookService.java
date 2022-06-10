package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
class AddressBookService implements IAddressBookService {
    private List<AddressBookData> addressBooklist = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBooklist;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBooklist.size() + 1, addressBookDTO);
        addressBooklist.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int pinCode, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressByPinCode(pinCode);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBooklist.set(pinCode - 1, addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int pinCode) {
        addressBooklist.remove(pinCode);
    }

    @Override
    public AddressBookData getAddressByPinCode(int pinCode) {
        return addressBooklist.get(pinCode - 1);
    }
}