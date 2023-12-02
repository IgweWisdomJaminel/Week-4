
/*
A static block is a class block that belong to the class when an Object is intantialized the class
Loads then the
 */
 public class StaticBlock {
    private String name= "chiamaka";
    /*
    So basicaly the static block loads before the constructor when the Objectis istantialized
    and it loads only once
     */
 public  StaticBlock(){
     name= "Ifeanyi";
     System.out.println("Not static");

    }
    static {


        System.out.println("Static block");
    }

    public static void main(String[] args) throws Exception {// You have to catch an exception while using the Class.forName
        StaticBlock staticBlock = new StaticBlock();
        Class.forName("StaticBlock");// This is for loading the class without the creation of an object
    }
}
