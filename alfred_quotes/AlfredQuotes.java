import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello,"+ name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date today = new Date();
        return "It is currently " + today;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String a = new String("Alexis");
        String b = new String("Alfred");

        if(conversation.indexOf(a) > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(conversation.indexOf(b) > -1){
            return "At your service. As you wish, naturally.";
        }
        
        return "Right. And with that I shall retire.";
    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

