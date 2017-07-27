package notebook.model.builders;

import notebook.model.Address;

/**
 * @author Oleksii Petrokhalko.
 */
public class AddressBuilder implements Builder<Address> {
    private Address address;

    public AddressBuilder() {
        address = new Address();
    }

    public AddressBuilder withPostCode(String postcode) {
        address.setPostcode(postcode);
        return this;
    }

    public AddressBuilder withCity(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder withStreet(String street) {
        address.setStreet(street);
        return this;
    }

    public AddressBuilder withHouseNumber(String houseNumber) {
        address.setHouseNumber(houseNumber);
        return this;
    }

    public AddressBuilder withFlatNumber(String flatNumber) {
        address.setFlatNumber(flatNumber);
        return this;
    }

    @Override
    public Address build() {
        return address;
    }
}
