package io.pragra.learning;

public class OfficeAddress implements IAdreess {
    private String officeName;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
