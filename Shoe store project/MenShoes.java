public class MenShoes extends Shoes {
    public MenShoes(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }

    @Override
    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}
