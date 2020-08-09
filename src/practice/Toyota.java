package practice;

public class Toyota {

    private int Sl;
    private String carModel;
    private String color;
    private String year;
    private String price;

    public Toyota(int sl, String carModel, String color, String year, String price) {
        Sl = sl;
        this.carModel = carModel;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getSl() {
        return Sl;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }
}

