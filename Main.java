public class Main {
    public static void main(String[] args) {

        Vehicle civic = new Vehicle("V2018HC", "Civic", "TypeR", 2018, "Honda", 20000.0);

        customer customer = new customer("C101", "John", "Queens 011", "023-5514325");

        salesperson salesperson = new salesperson("S20103", "Kevin", "BB1 Street", "023-484411");

        Invoice invoice = new Invoice("INV101", "2029-12-23", customer, salesperson, civic);

        invoice.printInvoice();
    }
}
