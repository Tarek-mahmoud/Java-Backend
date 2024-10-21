
public class ContentManager extends User {

/*//    @Override
    public void validateAccessRights(int i) {
        System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
    }*/

    @Override
    public void validateAccessRights() {
        System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
    }

    @Override
    public ProfileInformationData getProfileInformation(Profile profile) {
        return new AccountInformation();
    }
}
