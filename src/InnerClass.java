/*
Inner classes are classes that exist within the body of another class the inner class can be static
but the outer class cannot be static the outer class can either have an access modifier abstract or final keyword
when Objects are to be created you must call the the inner class objetct with a refercne to the outter as a type
 */

public class InnerClass {

    public void outerOne(){
        System.out.println("I'm outer one");

    }

    static class Inner {
        public void innerOne(){
            System.out.println("I'm inner one");

        }

    }

    public static void main(String[] args) {
      InnerClass inner = new InnerClass();

      InnerClass.Inner inner1= new Inner();
      inner1.innerOne();


    }

}
