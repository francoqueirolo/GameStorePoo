package models;

public abstract class VideoGame {
    private String title;
    private String category;
    private double price;
    private String code;

    public String getCode() {
        return code;
    }

    public VideoGame(String code, String title, String category, double price) {
        this.code = code;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void showDetails();
}
