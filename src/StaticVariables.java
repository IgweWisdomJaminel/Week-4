
class Variable{

    static String name;
     static int Age;


}
public class StaticVariables {

    public static void show(){
        System.out.println(Variable.name+" "+Variable.Age);
    }
    /*
    Static variable are the variables shared by the properties of a class if you want to call a directly
    You can use the class name
     */
    public static void main(String[] args) {
        Variable.Age=3;
        Variable.name="chiamaka";
        show();

    }
}
