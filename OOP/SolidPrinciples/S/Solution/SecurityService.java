package Section12.SolidPrinciples.S.Solution;
import Section12.SolidPrinciples.S.Solution.Role;


public class SecurityService {

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;
    }
}