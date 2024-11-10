public class Main {
    public static void main(String[] args) {
        MenShoes menShoe = new MenShoes("Men's Formal Shoe", 120.00, 10, Brand.ALDO, Type.FORMALS, 9, 000);
        WomenShoes womenShoe = new WomenShoes("Women's Casual Shoe", 80.00, 5, Brand.NIKE, Type.CASUAL_SHOES, 7, 600);
        Infants infantShoe = new Infants("Infant's Sandal", 40.00, 20, Brand.PUMA, Type.SANDALS_SLIDES, 5, 400);

        System.out.println(menShoe);
        System.out.println(womenShoe);
        System.out.println(infantShoe);

        System.out.println("Men's Shoe Size: " + menShoe.getSizeInfo());
        System.out.println("Women's Shoe Size: " + womenShoe.getSizeInfo());
        System.out.println("Infant's Shoe Size: " + infantShoe.getSizeInfo());
    }
}
