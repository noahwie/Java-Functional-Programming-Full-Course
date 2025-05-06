package functionalinterface;

import java.util.List;
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
    static Supplier<List<String>> getDBConnectionSupplier = () ->
           List.of(
                   "jdbc://localhost:5432/users",
                   "jdbc://localhost:5432/customers"
           );
    //Imperative
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }
}
