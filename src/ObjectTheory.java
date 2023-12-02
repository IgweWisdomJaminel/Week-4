import java.util.Calendar;

//*.In Java Every class has two things a behaviour(Action) and Properties(knowledge)
// And every class created are attributed to an object
// We provide the class and the JVM converts processes in Byte code and created and Object
class Calculate{
    public int calculate(int n1,int n2){
        System.out.println(n1+n2);

        return n1+n2;
    }
    public int subtract(int n1, int n2){
        int r= n1-n2;
        return r;
    }

}

public class ObjectTheory {
    //This method has a field that collects two int data types and also return both summed up



    public static void main(String[] args) {
      //Main Method: Our code does not load without a main method.
      int num1;
      int num2;
      //An Object of calculate is created
      Calculate objectTheory = new Calculate();
      //type       //reference        //Design

        int result= objectTheory.calculate(2,3);

        System.out.println(result);

        System.out.println( objectTheory.calculate(2,3));

    }



}
