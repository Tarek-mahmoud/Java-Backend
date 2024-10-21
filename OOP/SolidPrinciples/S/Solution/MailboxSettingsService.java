package Section12.SolidPrinciples.S.Solution;

public class MailboxSettingsService {
    private SecurityService securityService;

    {
        securityService = new SecurityService();
    }

    public void changeSecondaryEmail(User user, String secondaryEmail) {
        if (securityService.hasAccess(user))
            user.setSecondaryEmail(secondaryEmail);
    }
}