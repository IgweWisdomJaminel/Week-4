package LowLevelDesignSolidPrinciple;
/*
OCP stands for open closed principle This states that a super class should be extensible without being directly modified
Open for extension closed for modificcation
 */
abstract interface Calculate {
    int calculate(int a, int b);
}
class Subtract implements Calculate {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }//instead of modifying this method in the base clas we implment and gave a new fuction


    public class OCP {

    }
}