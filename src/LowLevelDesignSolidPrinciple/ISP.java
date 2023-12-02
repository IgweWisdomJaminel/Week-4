package LowLevelDesignSolidPrinciple;
/*
This is a principle that states that it is better to have more that one iheritance with various methods
than have one that have several methods and force implements or overide methods when not needed
ISP stands for Iheritance segregation priciple
 */
interface CalculateInt {
    int add();
}
interface CalculateDouble{
    double add();
}

class IntAdd implements CalculateDouble{
    @Override
    public double add() {
        return 0;
    }
}
public class ISP implements CalculateInt{

    @Override
    public int add() {
        return 0;
    }

}
