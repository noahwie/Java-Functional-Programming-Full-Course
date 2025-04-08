package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main (String[] args) {
        System.out.println("//Imperative");
        //Imperative
        int increment = incrementByOne(0);
        System.out.println(increment);

        System.out.println(incrementByOneAndMultiply(1, 10));

        System.out.println("//Declarative");
        System.out.println("//Function takes 1 argument and returns result");
        //Declarative
        //Function takes 1 argument and returns result
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        System.out.println("//Chain two functions together with andThen");
        //Use two functions together with andThen
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(2));

        System.out.println("//BiFunction takes two inputs and returns 1 output");
        //BiFunction takes two inputs and returns 1 output
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));




    }

    //Declarative Functions
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    //Imperative
    static int incrementByOne(int number){

        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){

        return (number + 1) * numToMultiplyBy;
    }
}
