package harshdeepsingh_sec002_ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Given data
        Invoice[] invoices = {
                new Invoice("87", "Electric Sander", 7, 59.98),
                new Invoice("24", "Power Saw", 18, 99.99),
                new Invoice("7", "Sledge Hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn Mower", 3, 79.50),
                new Invoice("68", "Screw Driver", 106, 6.99),
                new Invoice("56", "Jig Saw", 21, 11.00)
        };

        //Sort the Invoice objects by partDescription
        List<Invoice> sortedByPartDescription = Arrays.stream(invoices)
                .sorted((inv1, inv2) -> inv1.getPartDescription().compareTo(inv2.getPartDescription()))
                .collect(Collectors.toList());
        System.out.println("Sorted by Part Description:");
        sortedByPartDescription.forEach(System.out::println);

        System.out.println();

        //Sort the Invoice objects by pricePerItem
        List<Invoice> sortedByPricePerItem = Arrays.stream(invoices)
                .sorted((inv1, inv2) -> Double.compare(inv1.getPricePerItem(), inv2.getPricePerItem()))
                .collect(Collectors.toList());
        System.out.println("Sorted by Price Per Item:");
        sortedByPricePerItem.forEach(System.out::println);

        System.out.println();

        //Map each Invoice to its partDescription and quantity, then sort by quantity
        List<String> partDescriptionAndQuantity = Arrays.stream(invoices)
                .map(inv -> inv.getPartDescription() + " - Quantity: " + inv.getQuantity())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Part Description and Quantity:");
        partDescriptionAndQuantity.forEach(System.out::println);

        System.out.println();

        //Map each Invoice to its partDescription and value (quantity * pricePerItem), then order by value
        List<String> partDescriptionAndValue = Arrays.stream(invoices)
                .map(inv -> inv.getPartDescription() + " - Value: " + (inv.getQuantity() * inv.getPricePerItem()))
                .sorted((str1, str2) -> {
                    double value1 = Double.parseDouble(str1.split(": ")[1]);
                    double value2 = Double.parseDouble(str2.split(": ")[1]);
                    return Double.compare(value1, value2);
                })
                .collect(Collectors.toList());
        System.out.println("Part Description and Value:");
        partDescriptionAndValue.forEach(System.out::println);

        System.out.println();

        //Select invoice values in the range $200 to $500
        List<String> partDescriptionAndValueInRange = Arrays.stream(invoices)
                .filter(inv -> inv.getQuantity() * inv.getPricePerItem() >= 200 && inv.getQuantity() * inv.getPricePerItem() <= 500)
                .map(inv -> inv.getPartDescription() + " - Value: " + (inv.getQuantity() * inv.getPricePerItem()))
                .collect(Collectors.toList());
        System.out.println("Part Description and Value in Range $200 to $500:");
        partDescriptionAndValueInRange.forEach(System.out::println);

        System.out.println();

        //Find any invoice in which the partDescription contains the word "saw"
        Invoice sawInvoice = Arrays.stream(invoices)
                .filter(inv -> inv.getPartDescription().toLowerCase().contains("saw"))
                .findFirst()
                .orElse(null);
        System.out.println("Invoice with partDescription containing 'saw':");
        System.out.println(sawInvoice);
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return "Part Number: " + partNumber +
                ", Part Description: " + partDescription +
                ", Quantity: " + quantity +
                ", Price Per Item: " + pricePerItem;
    }
}

