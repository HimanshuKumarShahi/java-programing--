public class firstprog{
    public static void main(String[] args) {
        String x="Water"; 
        String y="cola";
        System.out.println( "X =" + x);
        System.out.println( "y =" + y);
        System.out.println("After Swapping :)");
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println( "X =" + x);
        System.out.println( "y =" + y);
    }
}