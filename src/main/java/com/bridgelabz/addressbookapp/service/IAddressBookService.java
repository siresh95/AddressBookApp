package com.bridgelabz.addressbookapp.service;


import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressByPinCode(int pinCode);

    AddressBookData createAddressBookData(AddressBookDTO addressbookDTO);

    AddressBookData updateAddressBookData(int pinCode, AddressBookDTO addressbookdto);

    void deleteAddressBookData(int pinCode);


}