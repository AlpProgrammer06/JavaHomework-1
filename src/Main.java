public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Save();
        creditManager.Calculate();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.delete();

        Company company = new Company();
        company.setCompanyName("Arçelik");
        company.setTaxNumber("123456567");
        company.setId(1);

        Person person = new Person();
        person.setNationalIdentity("16363543545");

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();


    }
}
