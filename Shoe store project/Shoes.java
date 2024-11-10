public class Shoes extends Item {
    private Brand brand;
    private Type type;
    private int colorCode;
    protected int size;

    public Shoes(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity);
        this.brand = brand;
        this.type = type;
        this.colorCode = colorCode;
        this.size = size;
    }

    public Brand getBrand() {
        return brand;
    }

    public Type getType() {
        return type;
    }

    public int getColorCode() {
        return colorCode;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Type: " + type + ", Color Code: " + colorCode;
    }

    protected int convertToEuro(int size) {
        return size + 32;
    }

    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}
