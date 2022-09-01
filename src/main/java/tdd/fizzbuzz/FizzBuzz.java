package tdd.fizzbuzz;

public class FizzBuzz {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";
    public  String countOff(int order){
        if (order % 3 == 0){
            if(order % 5 == 0){
                if(order % 7 == 0){
                    return FIZZ+BUZZ+WHIZZ;
                }
                return FIZZ+BUZZ;
            }
            if(order % 7 == 0){
                return FIZZ+WHIZZ;
            }
            return FIZZ;
        }
        if (order % 5 == 0){
            if(order % 7 == 0){
                return BUZZ+WHIZZ;
            }
            return BUZZ;
        }
        if (order % 7 == 0){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
