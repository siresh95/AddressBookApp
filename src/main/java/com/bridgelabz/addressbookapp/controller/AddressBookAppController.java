package com.bridgelabz.addressbookapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;


@RestController
@RequestMapping("/addressbookapp")
/*@RequestMapping:Used to set the class level URL.
 */
public class AddressBookAppController {
    /*@RequestMapping:Used to take the URL for displaying message.
     * return:message.
     */
    @RequestMapping(value = { "/get" })
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }
    /*@GetMapping:used to pass the URL With Id.
     * return:pass the message for particular id.
     */
    @GetMapping("/get/{pinCode}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("pinCode") int pinCode) {
        return new ResponseEntity<String>("Get Call Success for Id: " + pinCode, HttpStatus.OK);
    }
    /*@PostMapping:used to pass the URL
     * @RequestBody:pass the object.
     * return:created fields with the values.
     */
    @PostMapping("/create")
    public ResponseEntity<String> getAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created AddessBook Data for: " +  addressBookDTO, HttpStatus.OK);
    }
    /*@PutMapping:use to update the specified value.
     * return:updated value.
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated data Data for: " + addressBookDTO, HttpStatus.OK);
    }
    /*DeleteMapping: use to pass the URL with id.
     * return: delete the data of particular id.
     */
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete call success for id: " + empId, HttpStatus.OK);
    }
}