import java.util.*;
public class ChatArchive {
    private ArrayList<String> messages;
     
    public void MessageList(){
    messages = new ArrayList<String>();
    }
 
    public synchronized String removeFirst(){ // remove first message from the ArrayList
        if(!messages.isEmpty())
        {
           return messages.remove(0);
        }
        else
            return null;
    }
 
    public void add(Object o){ // add into the ArrayList
        messages.add((String) o);
    }
 
    public boolean isEmpty (){   // check if the list is empty or not
        return messages.isEmpty();
    }
}