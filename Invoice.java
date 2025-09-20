public class Invoice {
    private String invoiceID;
    private String date;

    private customer customer;
    private salesperson salesperson;
    private Vehicle vehicle;

    public Invoice(String invoiceID, String date, customer customer, salesperson salesperson, Vehicle vehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
    }
    public void printInvoice() {
        System.out.println("====== Sales Invoice ======");
        System.out.println("Invoice ID:\n" + invoiceID + "Date:" + date);
        System.out.println("\n====== Customer ======");
        customer.displayInfo();
        System.out.println("\n====== Salesperson ======");
        salesperson.displayInfo();
        System.out.println("\n====== Vehicle ======");
        vehicle.displayInfo();
    }

    
}
