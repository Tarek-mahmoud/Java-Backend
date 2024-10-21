package Section12.SolidPrinciples.S.Problem;

public class User {
    private int id;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;

    public int getId() {
        return id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public void sendMoney(User userTo, double dollarsAmount) {
        // some code here
    }

    public Role getRole() {
        return role;
    }
}