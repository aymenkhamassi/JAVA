import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate.toString();
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }
    
    // NINJA BONUS
    // You can implement your own method for the Alfred bot using any String methods.
    // For example, let's say Alfred sometimes yells when he's angry.
    public String angryResponse(String input) {
        return input.toUpperCase() + "!!! HOW DARE YOU!!!";
    }
}
