public class Apartment {
    private String title;
    private double price;
    private String address;

    public Apartment(String title, double price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }


    public double payPerMonth(int numberOfStudents) {
        return price / numberOfStudents;
    }

    @Override
    public String toString() {
        return "Квартира: " + title + ", Цена: " + price + ", Адрес: " + address;
    }
}
