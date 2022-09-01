package tdd.fizzbuzz;

public class FizzBuzz {
    public  String countOff(int order){
        StringBuilder message = new StringBuilder();
        if (order % 3 == 0){
            message.append("Fizz");
        }
        if (order % 5 == 0){
            message.append("Buzz");
        }
        if (order % 7 == 0){
            message.append("Whizz");
        }
        if (message.length() == 0){
            message.append(order);
        }
        return message.toString();
    }
}
