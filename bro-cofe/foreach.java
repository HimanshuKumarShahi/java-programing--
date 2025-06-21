import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // String[] food={"beans","pizza","coconuts"};
        // for(String i : food)
        // {
        //     System.out.println(i);
        // }
        // -----------------
        System.out.println("please enter the value of x: ");
        int x=scanner.nextInt();
        System.out.println("please enter the value of y: ");
        int y=scanner.nextInt();
        System.out.println("the sum is:" + add(x,y) );
        System.out.println("the sub is:" + sub(x,y) );
        System.out.println("the mul is:" + mul(x,y) );
        System.out.println("the div is:" + div(x,y) );
        System.out.println("the rem is:" + rem(x,y) );
        scanner.close();
    }
    static int add(int x,int y){
       
        return x+y;
    }
    static int sub(int x,int y){
       
        return x-y;
    }
    static int mul(int x,int y){
       
        return x*y;
    }
    static int div(int x,int y){
       
        return x/y;
    }
    static int rem(int x,int y){
       
        return x%y;
    }
   
  
}
