/*
This is the ability of a subclass class to iherit the method of parent class and change its function
 */

class Test{

    public void myName(){
        System.out.println("wisdom");
    }

}
class Test2 extends Test{


    public void myName() {
        System.out.println("wisdom1");
    }
}
public class MethodOveridding {

    public static void main(String[] args) {
        Test test =new Test2();//This is called Dynamic method dispatch in Polymorphism which uses the runtime overinding method
        test.myName();//This problem is called an ambiguity problem when there two same method with same key with two classes that extend the latter
    }

}
