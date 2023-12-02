/*
A wrapper class in java are classe that are linked to primitive type every primitive type has a wrapper class
Example
Integer int
Double double
Character char
 */

public class WrapperClass {
    public static void main(String[] args) {
        int num = 9;
        Integer num1= num;//this know as autoboxing
        int num2 = num1.intValue();//this is known as boxing
        num2= num1;//this is know as autoBOxing
    }
}
