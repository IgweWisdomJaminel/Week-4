/*
An annonymous innerclass in java is class that exist in the body on a class object it has no name and its attirbutes or methods are excuted
When compiled
 */

public class AnonymousClass {

    public void newMessage(){
        System.out.println("This is the first message");
    }
    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass(){//This is known as an annonymous inner  class it has
            public void newMessage(){
                System.out.println("This is the inner message");
            }

        };
        anonymousClass.newMessage();//So when ran it goes for the function with the innerClass


    }
}
