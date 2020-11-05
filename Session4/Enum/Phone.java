package Enum;

public class Phone {
    private Color color;
    private CompanyName companyName;
    private int price;

    public Phone(Color color, CompanyName companyName, int price) {
        this.color = color;
        this.companyName = companyName;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color=" + color +
                ", companyName=" + companyName +
                ", price=" + price +
                '}';
    }
}
