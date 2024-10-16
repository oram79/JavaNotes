package Practice.Week2;

public class Invoice {
    private static int invoiceCount = 0;
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public Invoice(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public Invoice(Invoice other) {
        this.id = other.id;
        this.description = other.description;
        this.quantity = other.quantity;
        this.unitPrice = other.unitPrice;
        invoiceCount++;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    public static int getInvoiceCount() {
        return invoiceCount;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + id + ", Description: " + description +
               ", Quantity: " + quantity + ", Unit Price: $" + unitPrice +
               ", Total: $" + getTotal();
    }
}

