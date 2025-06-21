import java.util.Scanner;

public class input {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = scanner.nextLine();
      System.out.println("What is your Age?");
      int age = scanner.nextInt();
      System.out.println("What is your favourite food?");
      scanner.nextLine();
      String food=scanner.nextLine();
      System.out.println("Your name is:=" + name);
      System.out.println("Your age is:=" + age + "years :)");
      System.out.println("Your favourite Food is:=" + food);
      
      scanner.close();
   }
}