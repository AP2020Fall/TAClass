package book;

public class Address {

    private String country;
    private String city;
    private String street;

    public Address(String country, String city, String street) {
        setCountry(country);
        setCity(city);
        setStreet(street);
    }

    // setters  --> Immutable
    private void setCountry(String country) {
        this.country = country;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    // getters
    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
