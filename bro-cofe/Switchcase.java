public class Switchcase {
    public static void main(String[] args) {
        String day="friday";
        switch (day)
         {
            case "sunday":
                System.out.println("today is sunday");
                break;
            case "Monday":
                System.out.println("today is monday");
                break;
            case "Tuesday":
                System.out.println("today is tuesday");
                break;
            case "wednesday":
                System.out.println("today is wednesday");
                break;
            case "thrusday":
                System.out.println("today is thrusday");
                break;
            case "friday":
                System.out.println("today is friday");
                break;
            case "saturday":
                System.out.println("today is saturday");
                break;
        
            default:
            System.out.println("today is restday");
                break;
        }
    }
}
