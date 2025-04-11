package functionalinterface;

import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.function.Function;

public class _Function2 {
    public static void main(String[] args) {
        Function<Long, Boolean> primeWithMemory = Memory.memoize(n -> Prime.isPrime(n));
        System.out.println(primeWithMemory.apply(41L));
    }

    public static class Prime {
        public static boolean isPrime(long n){

            for(int i = 2; i*i <=n; i++){
                if (n%i == 0){
                    return false;
                }
            }
            return true;
        }

    }

    public static class Memory {
        public static Function<Long, Boolean> memoize(Function<Long, Boolean> func) {
            Hashtable<Long, Boolean> cache = new Hashtable<>();
            return n -> {
                if (cache.containsKey(n)) {
                    return cache.get(n);
                } else {
                    boolean result = func.apply(n);
                    cache.put(n, result);
                    return result;
                }
            };
        }
    }
}
