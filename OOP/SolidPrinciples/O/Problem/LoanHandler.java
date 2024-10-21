package Section12.SolidPrinciples.O.Problem;

public class LoanHandler {

    private PersonalLoanValidator personalLoanValidator;
    private MortgageLoanValidator mortgageLoanValidator;

    public void approachPersonalLoan(User user) {
        if (personalLoanValidator.isValidateForPersonalLoan(user)) {
            // process with personal loan approval
        }
    }

    public void approachMortgageLoan(User user) {
        if (mortgageLoanValidator.isValidateForMortgage(user)) {
            // process with personal loan approval
        }
    }
}