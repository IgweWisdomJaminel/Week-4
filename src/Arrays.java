import java.util.Scanner;

/*
Arrays in java are used for storing for that one value  values are then referenced by indexes
And indexes starts from 0 to length-1 being the last value
The sizes of array can't be changed when defined dynamically
If you try to store values more the size of an array it gives an error called array outofBound
which states that the item you are trying the add excedes the length of the array
 */
public class Arrays {


    public static void arrayReverse(){
        int []array= new int[4];//This is dynamic defined array and you can't chanege onece assigned a learn't value
        int []array2={1,2,3,4};

        /*
        This defined loop is to make array 2 print out in reversed form
        we first intialized to variables i=0 and
         */
        for(int i = 0,j=array2.length-1; i<=j; j-- ){
            System.out.println(array2[j]);
            int num= array2[j];
            System.out.println();
        }
    }
    public static void inputArrayLoop(){
        int i;
        Scanner sc = new Scanner(System.in);
        int[]n= new int[5];
        for ( i=0; i<n.length; i++){
            n[i]=sc.nextInt();


 /*
 The values are place via Scanner through indexing into the loop "i" being the mode of indexing and then
 We will then need to print our values out
  */
        }

        for (int num: n){
            System.out.println(num);
            /*
            So this enhanced loop helps by placing n[1] into num which is then icremented thereby printing out
            selected values this :oper
             */
        }

        }
        public static void reversedArrayWithTwoLoops(){
            int []array2={1,2,3,4};
            for(int i=0; i<1; i++){// The first
                for(int j=array2.length-1; j>=i; j--){
                    System.out.println(array2[j]);
                }
            }

        }
        public static void multiDimensionalArray(){
        int[][]num= new int[3][4];
        for(int i=0; i<3; i++){//The first loop selects the single arrays [i] keeps track
            for(int j=0; j<4; j++){//The second loop then inserts the values in each elements till it gets to the desired size
                int random= (int) (Math.random()*10);//Random numbers are placed in the array normally Math.random returns double values
                num[i][j]=random;//but we casted(narrowing)and also priotized the arithmetic operation with brackets so it can solve before casting
                System.out.print(num[i][j]+" ");

            }
            System.out.println();
        }
        }
        public static void multiDimensionalArrayInput(){
        Scanner sc = new Scanner(System.in);
        int[][]num= new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                num[i][j]=sc.nextInt();



            }
            System.out.println("Input the other section of the array");


            }
            for(int[]n:num){
                for(int M:n){
                    System.out.print(M+" ");
                }
                System.out.println();
                System.out.println(num.length);
        }
        }



    public static void randomArrayLoop(){
        int []num= new int[5];
        for(int i = 0; i<num.length; i++){
            num[i]=(int)(Math.random()*10);
            System.out.println(num[i]);
        }


    }
    public static void jaggedArray(){
        int[][]num= new int[3][];
        num[0]= new int[4];
        num[1]= new int[3];
        num[2]= new int[2];
        for (int num1[]:num) {

            for (int n:num1) {
                n=(int)(Math.random()*10);
                System.out.print(n+" ");
            }
            System.out.println();

        }

    }
    public static void arrayObject(){ //This a method that teaches the concept of array object a class is already created there by giving us an object with a type student
        Students students = new Students();//Values are then assigned to each individual Object after creation a constructor could also be easily used here
        students.name = "Shakira";
        students.age = 12;
        Students studentsOne = new Students();
        studentsOne.name = "mmesoma";
        studentsOne.age = 14;
        Students students2 = new Students();
        students2.name = "vera";
        students2.age = 14;
        Students[] student = new Students[3];//The type students  arrray is then created with individual objects assigned to it
        student[0] = students;
        student[1] = studentsOne;
        student[2] = students2;
//        System.out.println(student[0].age+":"+student[0].name);
        for(int i=0; i<student.length; i++){ // loop throught the students array to print the values
            System.out.println(student[i].name+" "+student[i].age);//The name and age are called because the Objects are just printed in
        }
    }


    public static void main(String[] args) {
        //randomArrayLoop();
        // jaggedArray();
        // inputArrayLoop();
        // reversedArrayWithTwoLoops();
        //  multiDimensionalArray();
        //  multiDimensionalArrayInput();
        arrayObject();

    }
    static class Students{
        String name;
        int age;


    }
}
