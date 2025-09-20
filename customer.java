public class customer extends person {
    private String customerID;

    public customer(String customerID, String name, String address, String phone) {
        super(name, address, phone);
        this.customerID = customerID;
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + customerID);
        super.displayInfo();
    }
}
