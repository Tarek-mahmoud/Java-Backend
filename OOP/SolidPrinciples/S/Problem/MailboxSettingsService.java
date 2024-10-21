package Section12.SolidPrinciples.S.Problem;

public class MailboxSettingsService {

    public void changeSecondaryEmail(User user, String secondaryEmail) {
        if(hasAccess(user))
            user.setSecondaryEmail(secondaryEmail);
    }

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;
    }
}