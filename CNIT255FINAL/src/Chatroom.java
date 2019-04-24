
import java.util.*;

public class Chatroom {

    //Constructors
    public Chatroom() {
        this.ChatroomMembers = new ArrayList<>();
    }

    //Fields
    private int ChatroomId;
    private final ArrayList<ChatroomMember> ChatroomMembers;

    //Methods
    public int getId() {
        return this.ChatroomId;
    }

    public void connectNewMember(int userId, int securityRoleId) {
        this.ChatroomMembers.add(new ChatroomMember(userId, securityRoleId));
    }

    public void disconnectMember(int userId) {
        ChatroomMember deletedMember = null;
        for (ChatroomMember member : this.ChatroomMembers) {
            if (member.getUserId() == userId) {
                deletedMember = member;
                break;
            }
        }

        if (deletedMember != null) {
            this.ChatroomMembers.remove(deletedMember);
        }
    }

    public int[] getCurrentMembers() {
        int[] result = new int[this.ChatroomMembers.size()];

        int count = 0;
        for (ChatroomMember member : this.ChatroomMembers) {
            result[count] = member.getUserId();
            count++;
        }

        return result;
    }

    class ChatroomMember {

        //Constructors
        public ChatroomMember(int userId, int securityRoleId) {
            this.UserId = userId;
            this.SecurityRoleId = securityRoleId;
        }

        public ChatroomMember(int userId) {
            this.UserId = userId;
            this.SecurityRoleId = 1;
        }

        //Fields
        private final int UserId;
        private int SecurityRoleId;

        //Methods
        public int getUserId() {
            return this.UserId;
        }

        public int getSecurityRoleId() {
            return this.SecurityRoleId;
        }

        public void setSecurityRoleId(int securityRoleId) {
            this.SecurityRoleId = securityRoleId;
        }
    }
}
