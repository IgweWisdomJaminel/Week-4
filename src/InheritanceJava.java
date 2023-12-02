/*
this is the ability of a sub class to inherit features from a super class or a child class to inherit features form a parent class
 */
/*
When an Object a sub class is created it calls the super class for methods it doesn't have when requesed for

 */
class operation{

    private int answer;

    public int pow(int a, int b){
        return(int) Math.pow(a,b);
    }

    public int add(int n1,int n2){
        int answer=n1+n2;
        this.answer=answer;
//        System.out.println(answer);
       return n1+n2;
    }
    int sub(int n1,int n2){
        int answer=n1-n2;
        this.answer=answer;
       return n1-n2;
    }
     int div(int n1,int n2){
         int answer=n1/n2;
         this.answer=answer;
       return n1/n2;
    }
       int mul(int n1,int n2){
           int answer=n1*n2;
           this.answer=answer;


       return n1*n2;
    }
    public int getAnswer() {
        return answer;
    }




}
class calulatorZero extends operation{


    public  void displayAnswer(){
        System.out.println(super.getAnswer());
    }






}


public class InheritanceJava {
    public static void main(String[] args) {
        calulatorZero calulatorZero = new calulatorZero();//An object of the child class is created so basically every method with the aprent classs is accessible with the child class
        calulatorZero.add(12,13);

        calulatorZero.displayAnswer();

        calulatorZero.add(2,2);


    }
}
