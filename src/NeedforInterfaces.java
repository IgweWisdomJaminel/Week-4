
interface Computer{// An interface with a declared method was created which serves as an itermidary or selection
    void code();
}
class Laptop implements Computer{//Laptop is a type of computer so it implemeted the features of a computer method
    public void code(){//This is an overidding method which has been manipulated provided by the interface
        System.out.println("code compile run");
    }

}
class Desktop implements Computer{
    public void code(){//this is the implemented overidding method gotten from the interface it servess as an option
        System.out.println("code compile run Faster");
    }
}
public class NeedforInterfaces {//this is the concrete class that houses the main method
 public void DevComp(Computer comp){//this method collects a Object type called computer
     comp.code();//this is method declaration that calls any of the computer type object giving

 }
    public static void main(String[] args) {
     Desktop desk = new Desktop(); //two Object types were declared
     Laptop lap = new Laptop();
     NeedforInterfaces igweWisdom = new NeedforInterfaces();
     igweWisdom.DevComp(desk);

    }
}
