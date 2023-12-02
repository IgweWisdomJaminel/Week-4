
/*
Type casting is the ability to place an Object or variable inside of another

Upcating is the ability of place a lower type into a higher type
downcasting is the ability to place a higher type into a lower type
 */

class ObjectOne{

    public void showOne(){
        System.out.println("We are showing ObjectOne");

    }

}
class ObjectTwo extends ObjectOne{
    public void showThree(){
        System.out.println("We are showing ObjectTwo");
    }

        }

public class UpDownCasting {

   int numOne= 9;
   double numTwo= numOne;//This is known as upcasting

    double three= 3;
    int threeOne =(int) three;//this is known as down Casting

    public static void main(String[] args) {
        ObjectOne obj = new ObjectTwo();//So this is know as upcasting the Jvm does this automatically without needing us to introduce it through syntax
       //in this Object we will now be able to access the method in object two because Its a type type of Object one and Object one is not awaer that wo exists


      ObjectTwo objectTwo =(ObjectTwo) new ObjectOne();//So now this is called downcasting in java Because ObjectOne is a parentclass that is forcing a convertion to a childClass to be able to access or know its properties
      objectTwo.showThree();
      objectTwo.showOne();

    }
}
