/*
Abstraction in java is the ability of a class to hide its properties an Abstract class can have both an
abstract method and normal method it can also have both a declared and defined method You can not create objects
from abstract classes in java you would jave to extend the abstract class Then create an object form it subclass
A class with an abstract method must also be abstract
 */
abstract class Abstract1{

    public abstract void drivingMethod();//decleared method

    public void playMusic(){
        System.out.println("Playing Music");

    }



}

abstract class Abstract2 extends Abstract1{// if class is abstract all the method in the parent class do not need to be overidding

    @Override
    public void playMusic() {
        super.playMusic();
    }

    @Override
    public void drivingMethod() {
        System.out.println("we are driving");

    }
}
class AbstractThree extends Abstract2{//now this method I inherited all the properties of both Abstract2 and Abstract1

    @Override
    public void drivingMethod() {
        super.drivingMethod();
    }

    @Override
    public void playMusic() {
        super.playMusic();
    }
}

public class AbstractJava {
}
