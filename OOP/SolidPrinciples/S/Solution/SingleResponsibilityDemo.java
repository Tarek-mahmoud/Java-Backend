package Section12.SolidPrinciples.S.Solution;


public class SingleResponsibilityDemo {
    public static void main(String[] args) {

        MailboxSettingsService mailboxSettingsService = new MailboxSettingsService();
        User user = new User();

        // responsibility #1 for mailboxSettingsService: change mailbox
        mailboxSettingsService.changeSecondaryEmail(user, "fdsfsddf@gmail.com");


        // responsibility #1 for securityService
        SecurityService securityService = new SecurityService();
        if (securityService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}