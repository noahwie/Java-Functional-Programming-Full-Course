package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        //Imperative
        System.out.println("//Imperative");
        System.out.println(getDBConnectionUrl());

        System.out.println("//Declarative Supplier functional interface");
        //Supplier takes 0 Input and supplies data
        System.out.println(getDBConnectionSupplier.get());
    }

    //Declerative
    static Supplier<String> getDBConnectionSupplier = () ->
            "jdbc://localhost:5432/users";
    //Imperative
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }
}
