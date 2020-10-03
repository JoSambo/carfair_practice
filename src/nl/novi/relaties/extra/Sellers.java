package nl.novi.relaties.extra;

import java.util.ArrayList;
import java.util.List;

public class Sellers {

    private String companyName;
    private int telephoneNumber;
    private String website;
    final String VAT_NUMBER;
    private List<String> carToSell;

    public Sellers(String companyName, int telephoneNumber, String website, String VAT_NUMBER) {
        this.companyName = companyName;
        this.telephoneNumber = telephoneNumber;
        this.website = website;
        this.VAT_NUMBER = VAT_NUMBER;
        this.carToSell = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getVAT_NUMBER() {
        return VAT_NUMBER;
    }

    public List<String> getCarToSell() {
        return carToSell;
    }

    public void setCarToSell(List<String> carToSell) {
        this.carToSell = carToSell;
    }

    public void addCarToSell(List<String> cars) {
        for (String car : cars) {
            carToSell.add(car);
        }
    }

    @Override
    public String toString() {
        return "Verkoper " + this.getCompanyName() + " heeft de volgende auto's te koop: " + this.getCarToSell();
    }
}
