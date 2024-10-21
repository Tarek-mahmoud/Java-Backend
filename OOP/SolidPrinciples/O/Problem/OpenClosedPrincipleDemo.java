package Section12.SolidPrinciples.O.Problem;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {

        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approachPersonalLoan(user);
        loanHandler.approachMortgageLoan(user);

        // What about if we want to add new loan type ?????
    }
}