
public class ChatMessage implements Sendable {

    private final String messageId;
    private final String senderUserId;
    private final String messageContents;
    private final String timestamp;

    public ChatMessage() {
        
        Time currentTime = new Time();
        messageId = "";
        senderUserId = "";
        messageContents = "";
        timestamp = currentTime.CurrentDate();
    }

    public ChatMessage(String mId, String sendId, String mContents) {
        Time currentTime = new Time();
        messageId = mId;
        senderUserId = sendId;
        messageContents = mContents;
        timestamp = currentTime.CurrentDate();
        
    }
    
    @Override
    public String constructMessage(){
        return (getSenderUserId() + "::"+getTimestamp() + getMessageContents() );
    
    }

    /**
     * @return the messageId
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @return the senderUserId
     */
    public String getSenderUserId() {
        return senderUserId;
    }

    /**
     * @return the messageContents
     */
    public String getMessageContents() {
        return messageContents;
    }

    /**
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

}
