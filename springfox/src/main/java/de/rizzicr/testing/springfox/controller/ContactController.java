package de.rizzicr.testing.springfox.controller;

import de.rizzicr.testing.springfox.domain.Contact;
import de.rizzicr.testing.springfox.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by rizzi on 26.05.15.
 */
@RestController
@RequestMapping(value = "/contacts/")
@Api(value = "contacts", description = "API for contact operations")
@Slf4j
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ApiOperation(value = "List of branch offices")
    public List<Contact> getContacts() {
        return contactService.findAll();
    }

    @RequestMapping(value = "{contactId}", method = RequestMethod.GET)
    @ApiOperation(value = "Read the info of a single contact")
    public Contact getContact(@PathVariable String contactId) {
        if (StringUtils.isNotBlank(contactId)) {
            return contactService.findOne(contactId);
        }
        return Contact.builder().build();
    }

    @RequestMapping(value = "addContact1", method = RequestMethod.POST)
    @ApiOperation(value = "Add a new contact")
    public ResponseEntity<Void> addContact1(Contact contact) {
        log.debug(contact.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "addContact2", method = RequestMethod.POST)
    @ApiOperation(value = "Add a new contact")
    public ResponseEntity<Void> addContact2(@RequestPart Contact contact) {
        log.debug(contact.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "addContactWithFile", method = RequestMethod.POST)
    @ApiOperation(value = "Add a new contact with file attachment")
    public ResponseEntity<Void> addContactWithFile(@RequestPart Contact contact, @RequestPart MultipartFile singleFile) {
        log.debug(contact.toString());
        log.debug(singleFile.getName());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
