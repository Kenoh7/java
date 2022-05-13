import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    int getStreakGoal() {
        int result = 0;
        for(int i = 0; i < 11; i++){
            result+=i;
        }
        return result;
    }

    double getOrderTotal(double[] prices){
        double total = 0;
        for(int i=0;i<prices.length;i++){
            total+=prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems){
        // String menu = menuItems.get(0);
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i +" "+ menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}
