package de.rizzicr.testing.springfox.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;

@Entity
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Data
@EqualsAndHashCode(of = {"id"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "surname", "forename", "brief"})
public class Contact implements Serializable {

    private static final long serialVersionUID = -3691953100225344828L;

    @Id
    @GeneratedValue(generator = "uuid")
    @Column(length = 36, unique = true, nullable = false)
    private String id;
    @Column(unique = true)
    @JsonIgnore
    private Long   oldId;


    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    @DateTimeFormat(style = "MS")
    private ZonedDateTime createdDate;
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = {"profilerAccess", "contactType", "lastActivity", "lastLogin", "role", "gender", "contactData", "settings", "company", "createdDate", "createdBy", "lastModifiedDate", "lastModifiedBy", "lockedDate", "lockedBy", "personInCharge", "dateOfBirth", "academicDegree", "decider", "employer", "address", "addressPrivate", "age", "birthMonth", "updatable", "readable", "deletable", "isLocked"})
    private Contact       createdBy;
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    @DateTimeFormat(style = "MS")
    private ZonedDateTime lastModifiedDate;
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = {"profilerAccess", "contactType", "lastActivity", "lastLogin", "role", "gender", "contactData", "settings", "company", "createdDate", "createdBy", "lastModifiedDate", "lastModifiedBy", "lockedDate", "lockedBy", "personInCharge", "dateOfBirth", "academicDegree", "decider", "employer", "address", "addressPrivate", "age", "birthMonth", "updatable", "readable", "deletable", "isLocked"})
    private Contact       lastModifiedBy;

    private String forename, surname, brief, initial;
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
    @DateTimeFormat(style = "M-")
    private LocalDate dateOfBirth;
    private String    position, department;
    private boolean decider = false, employer = false;

    @Embedded
    private PostalAddress address     = new PostalAddress();
    @Embedded
    @JsonIgnoreProperties(value = {"telephonePN", "telefaxPN", "mobilePN", "telephonePrivatePN", "telefaxPrivatePN", "mobilePrivatePN", "emailPrivate", "webPrivate", "telephonePrivateFormattedNational", "telephonePrivateFormattedInternational", "telefaxPrivateFormattedNational", "telefaxPrivateFormattedInternational", "mobilePrivateFormattedNational", "emailPrivateLink", "webPrivateLink"})
    private ContactData   contactData = new ContactData();

    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    @DateTimeFormat(style = "MS")
    private ZonedDateTime lastActivity, lastLogin;


    @JsonProperty("isNew")
    public boolean isNew() {
        return StringUtils.isBlank(id);
    }

    @JsonProperty("DT_RowId")
    public String getDT_RowId() {
        return getId();
    }

    @JsonProperty("fullname")
    public String getFullname() {
        List<String> names = new ArrayList<>();
        if (forename != null) names.add(forename);
        if (surname != null) names.add(surname);
        return StringUtils.join(names, " ");
    }

    @JsonProperty("fullnameReverse")
    public String getFullnameReverse() {
        List<String> names = new ArrayList<>();
        if (surname != null) names.add(surname);
        if (forename != null) names.add(forename);
        return StringUtils.join(names, ", ");
    }

    public String getBriefComplete() {
        if (StringUtils.isNotBlank(brief) && StringUtils.isNotBlank(getSurname())) {
            return brief + " " + getSurname();
        }
        return null;
    }

    public int getAge() {
        if (dateOfBirth != null) {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
        return 0;
    }

    public int getBirthMonth() {
        if (dateOfBirth != null) {
            return dateOfBirth.getMonthValue();
        }
        return 0;
    }

    public String getMailLink() {
        if (getContactData() != null && StringUtils.isNotBlank(getContactData().getEmail())) {
            final StringBuilder sb = new StringBuilder("<a href=\"mailto:");
            sb.append(getContactData().getEmail()).append("\">");
            sb.append(getContactData().getEmail()).append("</a>");
            return sb.toString();
        }
        return null;
    }

    public String getMailLinkWithFullname() {
        if (getContactData() != null && StringUtils.isNotBlank(getContactData().getEmail())) {
            final StringBuilder sb = new StringBuilder("<a href=\"mailto:");
            sb.append(getContactData().getEmail()).append("\">");
            sb.append(getFullname()).append("</a>");
            return sb.toString();
        }
        return null;
    }

    @JsonIgnore
    public String getWebLink() {
        if (getContactData() != null && getContactData().getWeb() != null) {
            final StringBuilder sb = new StringBuilder("<a href=\"");
            sb.append(getContactData().getWeb()).append("\">");
            sb.append(getContactData().getWeb()).append("</a>");
            return sb.toString();
        }
        return null;
    }

    @JsonIgnore
    public String getWebLinkWithFullname() {
        if (getContactData() != null && getContactData().getWeb() != null) {
            final StringBuilder sb = new StringBuilder("<a href=\"mailto:");
            sb.append(getContactData().getWeb()).append("\">");
            sb.append(getFullname()).append("</a>");
            return sb.toString();
        }
        return null;
    }

}
