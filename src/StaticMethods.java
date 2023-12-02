import javax.lang.model.element.Name;
import java.util.SplittableRandom;

class VariableMethods{

     String Name;
     int Age;


}
public class StaticMethods {
   static String name;
   int Game;
    static int age;
    //A static method cannot call an instance varible without object creation or Object referece

    public static void show() {// in this method the age within the class was called by creating y calling an object refrence
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        name="maria";
        age=12;


        Variable.Age=3;
        Variable.name="chiamaka";
        show();
    }
}
