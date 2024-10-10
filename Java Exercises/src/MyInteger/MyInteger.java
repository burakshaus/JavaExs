package MyInteger;

import org.jetbrains.annotations.NotNull;

public class MyInteger implements MyIntegerInterface{
    // TODO
    int value;
    // Constructor with given value parameter
    public MyInteger(int value){
        this.value = value;
    }
    // Constructor without given any value
    public MyInteger(){
        this(0);
    }
    // Getter method
    public int getValue(){
        return value;
    }
    // Method to check the value if even or not
    public boolean isEven(){
//        if(value%2==0){
//            return true;
//        }
//        else {
//            return false;
//        }
        // simply code is below
        return value % 2 == 0;
    }
    // Method to check the value is odd or not
    public boolean isOdd(){
        return value % 2 != 0;
    }
    // Method to check the value is prime or not
    public boolean isPrime(){
        for(int i = 0; i<value; i++){
            if(value % i == 0 && i != 1 && i != value){
                return false;
            }
        }
        return true;
    }
    // Methods with given value
    public boolean isEven(int value){
        return value % 2 == 0;
    }
    public boolean isOdd(int value){
        return value % 2 != 0;
    }
    public boolean isPrime(int value){
//        The loop runs from i = 2 to sqrt(value), which reduces the number of iterations, improving performance for large numbers.
//        If value is divisible by any number in this range, it's not prime, so the function returns false. Otherwise, it returns true.
//        This approach efficiently checks whether a number is prime.
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Methods with given an instance of MyInteger class
    public boolean isEven(@NotNull MyInteger instance){
        return instance.value % 2 == 0;
    }
    public boolean isOdd(@NotNull MyInteger instance){ return instance.value % 2 != 0; }
    public boolean isPrime(@NotNull MyInteger instance) {
        for(int i = 2; i <= Math.sqrt(instance.value); i ++){
            if(instance.value % i == 0){
                return false;
            }
        }
        return true;
    }
    // Methods to check if the value is equals to the given parameter
    public boolean equals(int value){
        return value == this.value;
    }
    public boolean equals(@NotNull MyInteger instance){ return instance.value == value; }
    // Methods to parse int from given strings in two ways
    public static int parseInt(char [] charArray){
        return 0;
    }
    public static int parseInt(String string){
        return 0;
    }
}
