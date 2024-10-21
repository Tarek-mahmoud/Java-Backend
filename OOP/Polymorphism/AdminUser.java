
public class AdminUser extends User {

    private final String userGroup = "admin";

    @Override
    public void validateAccessRights() {
        System.out.println("I'm an admin user. I can do whatever I want in the system.");
    }

    @Override
    public AccountInformation getProfileInformation(final Profile profile) {
        //userGroup = "pla"
        // profile = new UserProfile();   // final argument
        return new AccountInformation();
    }
}
