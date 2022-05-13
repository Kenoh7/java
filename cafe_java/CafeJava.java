public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 4.5;
        double dripcoffeePrice = 5.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer2 + displayTotalMessage + lattePrice * 2);
        isReadyOrder2 = false;
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage+ (dripcoffeePrice - lattePrice));
    }
}