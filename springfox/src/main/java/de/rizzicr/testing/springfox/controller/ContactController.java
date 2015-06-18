package de.rizzicr.testing.springfox.controller;

import de.rizzicr.testing.springfox.domain.Contact;
import de.rizzicr.testing.springfox.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rizzi on 26.05.15.
 */
@RestController
@RequestMapping(value = "/contacts/")
@Api(value = "contacts", description = "API for contact operations")
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
}
