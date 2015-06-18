package de.rizzicr.testing.springfox.domain;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.io.Serializable;
import java.net.URL;
import java.util.Locale;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ContactData implements Serializable {

    private static final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

    private static final long serialVersionUID = -5221953039339300809L;

    @ApiModelProperty
    private String telephone;
    @Transient
    private PhoneNumber telephonePN = new PhoneNumber();
    @ApiModelProperty
    private String telefax;
    @Transient
    private PhoneNumber telefaxPN = new PhoneNumber();
    @ApiModelProperty
    private String mobile;
    @Transient
    private PhoneNumber mobilePN = new PhoneNumber();
    @ApiModelProperty
    private String email;
    @ApiModelProperty
    private URL    web;
    @ApiModelProperty
    private URL    web2;

    @ApiModelProperty
    private String telephonePrivate;
    @Transient
    private PhoneNumber telephonePrivatePN = new PhoneNumber();
    @ApiModelProperty
    private String telefaxPrivate;
    @Transient
    private PhoneNumber telefaxPrivatePN = new PhoneNumber();
    @ApiModelProperty
    private String mobilePrivate;
    @Transient
    private PhoneNumber mobilePrivatePN = new PhoneNumber();
    @ApiModelProperty
    private String emailPrivate;
    @ApiModelProperty
    private URL    webPrivate;

    private Boolean mailsync = true;

    public PhoneNumber getTelephonePN() {
        try {
            return phoneNumberUtil.parse(telephone, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return telephonePN;
    }

    public String getTelephoneFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(telephone, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getTelephoneFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(telephone, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public PhoneNumber getTelefaxPN() {
        try {
            return phoneNumberUtil.parse(telefax, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return telefaxPN;
    }

    public String getTelefaxFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(telefax, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getTelefaxFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(telefax, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public PhoneNumber getMobilePN() {
        try {
            return phoneNumberUtil.parse(mobile, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return mobilePN;
    }

    public String getMobileFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(mobile, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getMobileFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(mobile, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getEmailLink() {
        if (StringUtils.isNotBlank(email)) return "<a href=\"mailto:" + email + "\">" + email + "</a>";
        return "";
    }

    public String getEmailLink(String classes) {
        if (StringUtils.isNotBlank(email))
            return "<a href=\"mailto:" + email + "\" class=\"" + classes + "\">" + email + "</a>";
        return "";
    }

    public String getWebLink() {
        if (web != null) return "<a href=\"" + web + "\" target=\"_blank\">" + web + "</a>";
        return "";
    }

    public String getWebLink(String classes) {
        if (web != null) return "<a href=\"" + web + "\" target=\"_blank\" class=\"" + classes + "\">" + web + "</a>";
        return "";
    }

    public String getWeb2Link() {
        if (web2 != null) return "<a href=\"" + web2 + "\" target=\"_blank\">" + web2 + "</a>";
        return "";
    }

    public String getWeb2Link(String classes) {
        if (web2 != null)
            return "<a href=\"" + web2 + "\" target=\"_blank\" class=\"" + classes + "\">" + web2 + "</a>";
        return "";
    }

    public PhoneNumber getTelephonePrivatePN() {
        try {
            return phoneNumberUtil.parse(telephonePrivate, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return telephonePrivatePN;
    }

    public String getTelephonePrivateFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(telephonePrivate, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getTelephonePrivateFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(telephonePrivate, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public PhoneNumber getTelefaxPrivatePN() {
        try {
            return phoneNumberUtil.parse(telefaxPrivate, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return telefaxPrivatePN;
    }

    public String getTelefaxPrivateFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(telefaxPrivate, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getTelefaxPrivateFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(telefaxPrivate, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public PhoneNumber getMobilePrivatePN() {
        try {
            return phoneNumberUtil.parse(mobilePrivate, Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return mobilePrivatePN;
    }

    public String getMobilePrivateFormattedNational() {
        try {
            return phoneNumberUtil.formatOutOfCountryCallingNumber(phoneNumberUtil.parse(mobilePrivate, Locale.GERMANY.getCountry()), Locale.GERMANY.getCountry());
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getMobilePrivateFormattedInternational() {
        try {
            return phoneNumberUtil.format(phoneNumberUtil.parse(mobilePrivate, Locale.GERMANY.getCountry()), PhoneNumberFormat.INTERNATIONAL);
        } catch (final NumberParseException e) {
        }
        return null;
    }

    public String getEmailPrivateLink() {
        return "<a href=\"mailto:" + emailPrivate + "\">" + emailPrivate + "</a>";
    }

    public String getEmailPrivateLink(String classes) {
        return "<a href=\"mailto:" + emailPrivate + "\" class=\"" + classes + "\">" + emailPrivate + "</a>";
    }

    public String getWebPrivateLink() {
        return "<a href=\"" + webPrivate + "\" target=\"_blank\">" + webPrivate + "</a>";
    }

    public String getWebPrivateLink(String classes) {
        return "<a href=\"" + webPrivate + "\" target=\"_blank\" class=\"" + classes + "\">" + webPrivate + "</a>";
    }
}
