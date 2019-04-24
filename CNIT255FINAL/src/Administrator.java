
public class Administrator extends User {

    private String adminID;

    public Administrator() {
        super();
        adminID = "";
    }

    public Administrator(String adm) {
        super();
        adminID = adm;
    }

    /**
     * @return the adminID
     */
    public String getAdminID() {
        return adminID;
    }

    /**
     * @param adminID the adminID to set
     */
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

}
