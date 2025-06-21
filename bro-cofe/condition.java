import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("\"Enter Q or q to quit the game\"?");
        String responce=scanner.next();
        if(responce.equals("Q") || responce.equals("q"))
        {
            System.out.println("\"game Over  !!! you are exited\"");
        }
        else{
            System.out.println("you are still in game!!!!");
        }
        scanner.close();

        // int temp=40;
        // if(temp<=20)
        // {
        //     System.out.println("its neither cold nor warm");
        // }
        // else if(temp>=21 && temp<=30)
        // {
        //     System.out.println("its warm today");
        // }
        // else {
        //     System.out.println("Rainy day");
        // }
    }
}
