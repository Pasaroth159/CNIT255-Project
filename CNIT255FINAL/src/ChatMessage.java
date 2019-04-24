
public class ChatMessage implements Sendable {

    private final String messageId;
    private final String senderUserId;
    private final String messageContents;
    private final Time timestamp;

    public ChatMessage() {
        messageId = "";
        senderUserId = "";
        messageContents = "";
        timestamp = null;
    }

    public ChatMessage(String mId, String sendId, String mContents, Time ts) {
        messageId = mId;
        senderUserId = sendId;
        messageContents = mContents;
        timestamp = ts;
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
    public Time getTimestamp() {
        return timestamp;
    }

}
