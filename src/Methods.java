//Methods: For every Object are made up of modules AKA parts and this parts have behaviours
// and are used to perform specific task. For example a car is made up of several parts and
// these parts are used to perform certain tasks like moving, horning e.t.c.
// this is the same way that objects in java are made up of methods which are used to perfomr certain

import javax.sound.midi.Soundbank;

class MethodIntro{
    //Any method with a Void keyword states that it doesn't have any return value and is just used to perform a certain task
    public void Question(){
        System.out.println("What is 5+4");
    }
    //While methods with Data types return the type of data specified
    public String getAnswer(int ans){
        if(ans==9)
        return "you are correct";
        //In this if statment Immediately the condition is not actualized it leaves the return statement and intializes the second one

        return "you are wrong";
    }


}
//Method Overloading: A method can have one name with different parameters and Also fuctions and this is called
//Method overloading.
class MethodOverloading{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }



}
public class Methods {

    public static void main(String[]a){
        MethodIntro test = new MethodIntro();
        System.out.println("This is an example that explain methods");
       String result= test.getAnswer(9);
        System.out.println(result);
        System.out.println("This is an example that explains MethodOverLoading");
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("This method takes integer values");
        System.out.println(methodOverloading.add(2,2));
        System.out.println("This method takes double  values");
        System.out.println(methodOverloading.add(2,2));
    }


}
