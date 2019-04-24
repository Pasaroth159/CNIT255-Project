import java.util.*;

public class GlobalSession {
    //Constructors
    public GlobalSession(){
        this.AvailableChatrooms = new ArrayList<>();
    }
    
    //Fields
    private User LoggedInUser;
    private final ArrayList<Chatroom> AvailableChatrooms;
    
    //Methods
    public void CreateChatroom(Chatroom chatroom){
        this.AvailableChatrooms.add(chatroom);
    }
    
    public void DeleteChatroom(int chatroomId){
        //TODO: Implement this
    }
    
    public User getLoggedInUser(){
        return this.LoggedInUser;
    }
    
    public void setNewLoggedInUser(User newUser){
        this.LoggedInUser = newUser;
    }
}
