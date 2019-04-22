
public class User {

    private final int userId;
    private String username;
    private String password;
    private String screenName;

    public User() {
        userId = 0;
        username = "";
        password = "";
        screenName = "";
    }

    public User(int u, String uName, String pass, String scName) {
        userId = u;
        username = uName;
        password = pass;
        screenName = scName;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

}
