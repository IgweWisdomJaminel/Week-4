package LowLevelDesignSolidPrinciple;
//Stands for single reponsiblity principle this states that one inviduals class should have individual functions


class PayWithCard{
    public  PayWithCard(){
        System.out.println("Bills have been paid with cad");
    }
}

class PayWithCash{
    public PayWithCash(){
        System.out.println("Bills have been paid with cash");
    }
}
public class SRP extends PayWithCash{
    public SRP() {
        super();
    }

    public static void main(String[] args) {
        SRP srp = new SRP();
        
    }
}
