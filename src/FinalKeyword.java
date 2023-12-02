/*
In java the final keyword is used to avoid modification of a Class variable and method its also know as constant
 */

final class test{//Once the final keyword is used on this class the class can't be extended

    final int digits= 8;//once the final keyword is used in this vairable it can't be modified

    public final void set(){//once the final key is used in this method the method cann't be overrriding
        System.out.println("This is fianl in java");
    }
    //Once the final key word is used in a method the method cannot be overridding after a sub class has extended its super class

}

public class FinalKeyword {


}
