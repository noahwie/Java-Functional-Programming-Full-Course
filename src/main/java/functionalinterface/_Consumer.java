package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //creating customer
        Customer maria = new Customer("Maria", "99999");
        System.out.println("//Imperative normal Java Function");
        //Imperative
        greetCustomer(maria);

        System.out.println("//Declarative");
        System.out.println("//Consumer functional Interface");
        //Consumer accepts single input and returns no result
        greetCustomer.accept(maria);

        System.out.println("//BiConsumer functional Interface takes 2 inputs");
        //BiConsumer functional Interface takes 2 inputs
        System.out.println("//greetCustomerV2 true");
        greetCustomerV2.accept(maria, true);
        System.out.println("//greetCustomerV2 false");
        greetCustomerV2.accept(maria, false);
    }

    //Declarative
    static Consumer<Customer> greetCustomer = customer ->
            System.out.println("hello " + customer.customerName + " thanks for registering phonenumber " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhonenumber) ->
            System.out.println("hello " + customer.customerName + " thanks for registering phonenumber " + (showPhonenumber ? customer.customerPhoneNumber : "*******") );

    //Imperative
    static void greetCustomer(Customer customer) {
        System.out.println("hello " + customer.customerName + " thanks for registering phonenumber " + customer.customerPhoneNumber);
    }

    static class Customer {
        private String customerName;
        private String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
