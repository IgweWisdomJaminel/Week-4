/*
Encapsuation in java is the process of using Access mofifiers to detemine the
security of Variables Classes and Methods
Tip: It is advisable to put all instantialized varible with private
 */
class SetGet{

    private String name;//private instantialized variables cannot be accessed outside the of a class
    private int age;

    public int getAge(){//You can use methods to get varibles outside of a class when you create objects
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {// and also methods to set
        this.age = age;
    }
    public void setName(String name, SetGet st){//So there Object reference type creted
        st.name=name;//then we proceded to palce name into the new refrence

    }
    public void setName2(String name, SetGet st){//So there Object reference type creted
        SetGet setGet = st;//then proceded tp place the object refreence in side an new object thereby assinging it anew refrence
        setGet.name=name;//then we proceded to palce name into the new refrence

    }

}
public class EncapsulationJava {


    public static void main(String[] args) {
        SetGet setGet = new SetGet();//When you create an object of a paticular class you can call the methods within it
      setGet.setAge(17);//This fetches the methods within getset  class and puts it in another class
        System.out.println(setGet.getAge());
        setGet.setName("wosd",setGet);
        System.out.println(setGet.getName());


    }



}
