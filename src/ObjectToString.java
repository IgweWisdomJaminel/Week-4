import java.util.Objects;

class Latop{

    String name;
    int model;

 public String toString(){

     return name+ " "+model;
 }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Latop latop = (Latop) o;
        return model == latop.model && Objects.equals(name, latop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    public boolean check(Latop that){
     return this.name.equals(that.name)&& this.model==that.model;
 }


}


public class ObjectToString {

    public static void main(String[] args) {
        Latop latop = new Latop();
        latop.name="lenovo";
        latop.model=7400;

        Latop latop1 = new Latop();
        latop1.name="lenovo";
        latop1.model=7400;



        System.out.println(latop1.check(latop));


    }
}
