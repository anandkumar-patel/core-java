package anand.util.comparator;

public class Address implements Comparable<Address> {
    private int pinCode;
    private String streetName;

    public Address(int pinCode, String streetName) {
        this.pinCode = pinCode;
        this.streetName = streetName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", streetName='" + streetName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Address address) {
        return this.getPinCode()-address.getPinCode();
    }
}
