// bu clasta da operasyonlar tutuluyor.
// KATMANLI MİMARİLER ' görevler birbirinden ayrılır.

public class CustomerManager {
    Customer customer;
    ICreditManager iCreditManager;

    public CustomerManager(Customer customer) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }

    public void Save() {
        System.out.println("Müşteri eklendi" + this.customer.getId());
    }

    public void delete() {
        System.out.println("Müşteri silindi" + this.customer.getCity());
    }

    public void giveCredit() {
        iCreditManager.Calculate();
        System.out.println("Kredi verildi...");
    }


}
