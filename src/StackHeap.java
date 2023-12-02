//Stack and heap
// The stack is a data structure that follows the last in first out principle in java(LIFO) primitive variables,methods
//are stored there also object refrences are stored there the stack is made up of keys and values the key are the refrences
//while the values are the data's

//The Heap is a also a data structure that are used for storing objects within this objects are Class instance variables reference and also
//Method Bodies
//When you call an 2 object variable and change one's variable it only affects the one changed because objects are created sepreately
//On the heap
public class StackHeap {

    int num= 8;//This is stored on the stack

    public static int getAdd(int a, int b) {//now this is sorted in a stack named getAdd with thier indidviaual refrences stored in it
        return a+b;//This Arithemetic operation is performed in the main menu While the definiion is stored in the heap because its part of
        //class which is a blue print the object
    }


    public static void main(String[] args) { //main method has a stack of its own so as individual stacks
        StackHeap stackHeap = new StackHeap();//This object is stored on the heap with a reference number
     //While stackheap reference is stored on stack with the reference number as the value

        StackHeap stackHeap1 = new StackHeap();
        stackHeap1.num=2;
        //This does not affect other Objects when an Object is created in the heap it stays individually

        int result =getAdd(2,2); // this result is stored in the main method stack answer being 4

    }


}
