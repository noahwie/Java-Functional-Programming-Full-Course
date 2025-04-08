package functionalinterface;

import javax.swing.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("//Imperative normal Java Function");
        //Imperative
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("08000000000"));

        System.out.println("//Declarative");
        System.out.println("//Predicate functional Interface");
        //Predicate represents a boolean valued function of one argument
        System.out.println("is phonenumber valid = " + isPhonenumberValidPredicate.test("07000000000"));
        System.out.println("is phonenumber valid = " + isPhonenumberValidPredicate.test("08000000000"));

        System.out.println("//Multiple Predicates");
        //Multiple Predicates
        System.out.println("is phonenumber valid and contains number 3 = " + isPhonenumberValidPredicate.and(containsNumber3).test("07300000000"));
        System.out.println("is phonenumber valid and contains number 3 = " + isPhonenumberValidPredicate.and(containsNumber3).test("08400000000"));

        System.out.println("//BiPredicates take two inputs return one boolean");
        //BiPredicates take two inputs return one boolean
        System.out.println("phonenumber 1 matches phonenumber 2 = " + phonenumberEqualsSecondPhonenumber.test("0784039365", "0784039354"));
        System.out.println("phonenumber 1 matches phonenumber 2 = " + phonenumberEqualsSecondPhonenumber.test("0784039365", "0784039365"));
    }

    //Declarative
    static Predicate<String> isPhonenumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, String> phonenumberEqualsSecondPhonenumber = (phoneNumber1, phoneNumber2) ->
            phoneNumber1.equals(phoneNumber2);

    //Imperative
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
