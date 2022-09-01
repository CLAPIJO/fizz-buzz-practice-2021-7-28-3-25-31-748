package tdd.fizzbuzz;

public class FizzBuzz {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    public  String countOff(int order){
        if (order % 3 == 0){
            return FIZZ;
        }
        if (order % 5 == 0){
            return BUZZ;
        }
        return String.valueOf(order);
    }
}
