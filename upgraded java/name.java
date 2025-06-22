import java.util.ArrayList;

public class name {
    public static void main(String[] args) {
        // String id="Himanshu";
        // System.out.println(id.charAt(0));
        // System.out.println(id.isEmpty());
        // System.out.println(id.length());
        ArrayList<String> food = new ArrayList<>();
        food.add("apple");
        food.add("pizza");
        food.add("burger");
        food.add("pasta");
        for(int i=1;i<=food.size();i++)
        {
            System.out.println(food.get(i));
        }
    }
}
