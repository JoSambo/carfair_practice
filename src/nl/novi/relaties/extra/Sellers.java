package nl.novi.relaties.extra;

import java.util.ArrayList;
import java.util.List;

public class Sellers {

    private String companyName;
    private int telephoneNumber;
    private String website;
    final String VAT_NUMBER;
    private List<Cars> carToSell;

    public Sellers(String companyName, int telephoneNumber, String website, String VAT_NUMBER) {
        this.companyName = companyName;
        this.telephoneNumber = telephoneNumber;
        this.website = website;
        this.VAT_NUMBER = VAT_NUMBER;
        carToSell = new ArrayList<>();
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

    public List<Cars> getCarToSell() {
        return carToSell;
    }

    public void setCarToSell(List<Cars> carToSell) {
        this.carToSell = carToSell;
    }

    public void addCarToSell(Cars car) {
        carToSell.add(car);
    }
//    public void addCarToSell(List<Cars> cars) {
//        for (Cars car : cars) {
//            carToSell.add(car);
//        }
//    }

    @Override
    public String toString() {
        return "Verkoper " + "'" + companyName + "'" + " heeft de volgende auto's te koop: " + carToSell;
    }


}
