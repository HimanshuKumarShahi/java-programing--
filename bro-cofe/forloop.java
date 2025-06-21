import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int rows,columns;
       String character;
       System.out.println("\"Enter the rows: \"");
        rows=scanner.nextInt(); 
       System.out.println("\"Enter the columns: \"");
        columns=scanner.nextInt(); 
       System.out.println("\"Enter the character: \"");
        character=scanner.next(); 
        for(int i=1;i<=rows;i++)
        {
            System.out.println("");
            for(int j=1;j<=columns;j++)
        {
            System.out.print(character);
        }
         }
        //  --------------------
    // String[] books = {"c++","java","oops","python","c","c#"};
    // for(int i=0;i<=books.length;i++)
    // {
    //     System.out.println(books[i]);
    // }
        scanner.close();
    }
}