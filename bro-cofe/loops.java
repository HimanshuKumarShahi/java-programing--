import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();

        for(int i=1;i<10;i++){
            System.out.println(i);
            System.out.println("your name is:-" + name);
        }
        scanner.close();
    }
}
