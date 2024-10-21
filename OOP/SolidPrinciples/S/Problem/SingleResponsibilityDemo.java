package Section12.SolidPrinciples.S.Problem;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {

        MailboxSettingsService mailboxSettingsService = new MailboxSettingsService();
        User user = new User();

        // responsibility #1: of the MailboxSettingsService - change settings in mailbox
        mailboxSettingsService.changeSecondaryEmail(user, "fdgffdgfdf@gmail.com");

        // responsibility #2: of the MailboxSettingsService - verify access
        if (mailboxSettingsService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}