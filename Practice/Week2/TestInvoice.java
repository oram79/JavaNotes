package Practice.Week2;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("INV001", "Laptop", 2, 1500);
        Invoice inv2 = new Invoice("INV002", "Smartphone", 5, 800);
        Invoice inv3 = new Invoice(inv1);

        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);

        System.out.println("Total number of invoices created: " + Invoice.getInvoiceCount());
    }
}

