package nl.novi.relaties.extra;

public class Cars {

    private int constructionYear;
    private String brand;
    private String kind;
    private String licencePlateNumber;
    private double drivenKm;
    private double askingPriceExVAT;
    private double sellingPriceExVAT;

    public Cars(int constructionYear, String brand, String kind, String licencePlateNumber, double drivenKm, double askingPriceExVAT, double sellingPriceExVAT) {
        this.constructionYear = constructionYear;
        this.brand = brand;
        this.kind = kind;
        this.licencePlateNumber = licencePlateNumber;
        this.drivenKm = drivenKm;
        this.askingPriceExVAT = askingPriceExVAT;
        this.sellingPriceExVAT = sellingPriceExVAT;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public double getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(double drivenKm) {
        this.drivenKm = drivenKm;
    }

    public double getAskingPriceExVAT() {
        return askingPriceExVAT;
    }

    public void setAskingPriceExVAT(double askingPriceExVAT) {
        this.askingPriceExVAT = askingPriceExVAT;
    }

    public double getSellingPriceExVAT() {
        return sellingPriceExVAT;
    }

    public void setSellingPriceExVAT(double sellingPriceExVAT) {
        this.sellingPriceExVAT = sellingPriceExVAT;
    }

    public double askPriceVatInclusive(double askingPriceExVAT) {

        return askingPriceExVAT + askingPriceExVAT * 0.21;
    }

    public double sellPriceVatInclusive(double sellingPriceExVAT) {
        return sellingPriceExVAT + sellingPriceExVAT * 0.21;
    }
}