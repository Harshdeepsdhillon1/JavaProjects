public class WomenShoes extends Shoes {
    public WomenShoes(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }

    @Override
    protected int convertToEuro(int size) {
        return size + 30;
    }

    @Override
    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}
