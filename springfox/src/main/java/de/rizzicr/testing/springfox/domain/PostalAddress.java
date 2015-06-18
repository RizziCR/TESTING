package de.rizzicr.testing.springfox.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostalAddress implements Serializable, Cloneable {

    private static final long serialVersionUID = 5936376409704637019L;

    private String street;
    private String city;
    private String postcode;
    private String district;
    private String state;
    private String postbox;

    public String getPostcodeAndCity() {
        return StringUtils.join(new String[]{postcode, city}, ' ');
    }

    @Override
    protected PostalAddress clone() throws CloneNotSupportedException {
        return (PostalAddress) super.clone();
    }
}
