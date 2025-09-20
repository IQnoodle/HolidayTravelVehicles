public class salesperson extends person {
    private String salespersonID;

    public salesperson(String salespersonID, String name, String address, String phone) {
        super(name, address, phone);
        this.salespersonID = salespersonID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Salesperson ID: " + salespersonID);
        super.displayInfo();
    }
}
