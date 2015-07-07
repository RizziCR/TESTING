package de.rizzicr.testing.springfox.controller;

import de.rizzicr.testing.springfox.domain.Contact;
import de.rizzicr.testing.springfox.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
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
    public ResponseEntity<Void> addContact2(Contact contact) {
        log.debug(contact.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "addContactWithFile", method = RequestMethod.POST, consumes =
            { MediaType.MULTIPART_FORM_DATA_VALUE})
    @ApiOperation(value = "Add a new contact with file attachment")
    public ResponseEntity<Void> addContactWithFile(@RequestPart("contactPart") String contactPart,
                                                   @RequestPart("singleFile") MultipartFile singleFile) {
        log.debug(contactPart);
        log.debug(singleFile.getName());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "multipleRequestPartsWithApiParam", method = RequestMethod.POST, consumes =
            { MediaType.MULTIPART_FORM_DATA_VALUE})
    @ApiOperation(value = "Add a new contact with file attachment")
    public ResponseEntity<Void> multipleRequestPartsWithApiParam(
            @ApiParam(required=true)
            @RequestPart("contactPart1") String contactPart1,
            @ApiParam(required = true, allowableValues = "CREDENTIAL, LETTER, PHOTO, VITA")
            @RequestPart ("contactPart2") String contactPart2,
            @RequestPart("singleFile") MultipartFile singleFile) {
        log.debug(contactPart1);
        log.debug(singleFile.getName());
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "addContactAndFile", method = RequestMethod.POST)
    @ApiOperation(value = "Add a new contact with file attachment")
    public ResponseEntity<Void> addContactAndFile(@RequestPart("contactPart") MultipartFile contactPart,
                                                   @RequestPart("singleFile") MultipartFile singleFile) {
        log.debug(contactPart.getName());
        log.debug(singleFile.getName());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "addFiles", method = RequestMethod.POST)
    @ApiOperation(value = "Add a new contact with file attachment")
    public ResponseEntity<Void> addFiles( @RequestPart("files") MultipartFile [] files) {
        log.debug(String.valueOf(files.length));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
