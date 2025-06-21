import java.util.Scanner;
public class findheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the base of triangle?");
       double base=scanner.nextDouble();
       System.out.println("the base is :" + base);
       System.out.println("Enter the height of triangle?");
       double height=scanner.nextDouble();
       System.out.println("the base is :" + height);
       double hypotenus= Math.sqrt((base*base) + (height*height));
       System.out.println("the hypotenus is :" + hypotenus);
       scanner.close();
    }
}
