package io.pragra.learning;

public class HomeAddress implements IAdreess {
    private String streetName;
    private int streetAddress;
    private String city;
    private String coutry;


    public HomeAddress(String streetName, int streetAddress, String city, String coutry) {
        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.coutry = coutry;
    }

    @Override
    public String getAddress() {
        return toString();
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "streetName='" + streetName + '\'' +
                ", streetAddress=" + streetAddress +
                ", city='" + city + '\'' +
                ", coutry='" + coutry + '\'' +
                '}';
    }

    public void abcMethod() {
        System.out.println("MY ADDRESS IS READY TO USE");
    }
}
