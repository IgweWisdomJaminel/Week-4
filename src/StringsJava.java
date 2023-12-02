public class StringsJava {

  public static void  StringObject(){
      /*
      This is a String Object when created the  reference is stored in the stack while the
      Object is created in the heap with the data then the refrence is stored in the stack
      The String is also known as an array of characters and it is immutable So goes with the string liteal
       */
        String name = new String("ADA");


    }
    public static void main(String[] args) {
        String name1= "ADA";
        name1.concat("free");
        String str1 = new String("hello");
        String str2 = new String(str1) ;
        str1 = new String("world");
        System.out.println(str2);


    }
}
