package de.rizzicr.testing.springfox.service;

import de.rizzicr.testing.springfox.domain.Contact;
import de.rizzicr.testing.springfox.domain.ContactData;
import de.rizzicr.testing.springfox.domain.PostalAddress;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rizzi on 18.06.15.
 */
@Service
public class ContactService {

    List<Contact> contacts = new ArrayList<Contact>() {{
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-123").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-124").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-125").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-126").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-127").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-128").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-129").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-130").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-131").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-132").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-133").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-134").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-135").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-136").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-137").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-138").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-139").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
        add(Contact.builder().address(PostalAddress.builder().city("City").street("Street").postcode("12345").build()).brief("Sehr geehrter Herr").contactData(ContactData.builder().email("max@mustermann.de").mobile("123-123-123").build()).createdDate(ZonedDateTime.now().minusYears(1)).dateOfBirth(LocalDate.now()).decider(true).department("Department").employer(false).forename("Max").id("123-123-140").initial("MM").lastLogin(ZonedDateTime.now()).surname("Mustermann").build());
    }};

    public Contact findOne(String id) {
        Contact reqContact = Contact.builder().id(id).build();
        if (contacts.contains(reqContact)) {
            return contacts.get(contacts.indexOf(reqContact));
        }
        return null;
    }

    public List<Contact> findAll() {
        return contacts;
    }

}
