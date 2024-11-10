public class KidsShoes extends Shoes {
    public KidsShoes(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }
}

class Infants extends KidsShoes {
    public Infants(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }

    @Override
    protected int convertToEuro(int size) {
        return size + 19;
    }

    @Override
    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}

class Juniors extends KidsShoes {
    public Juniors(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }

    @Override
    protected int convertToEuro(int size) {
        return size + 32;
    }

    @Override
    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}

class Teens extends KidsShoes {
    public Teens(String name, double price, int quantity, Brand brand, Type type, int size, int colorCode) {
        super(name, price, quantity, brand, type, size, colorCode);
    }

    @Override
    protected int convertToEuro(int size) {
        return size + 32;
    }

    @Override
    public String getSizeInfo() {
        return size + " US / " + convertToEuro(size) + " Euro";
    }
}
