package Section12.SolidPrinciples.O.Solution;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {

        LoanHandler loanHandler1 = new PersonalLoanHandler(new PersonalLoanValidator());
        User user = new User();

        loanHandler1.approveLoan(user);

        LoanHandler loanHandler2 = new MortgageLoanHandler(new MortgageLoanValidator());
        loanHandler2.approveLoan(user);

        // add more and more
    }
}