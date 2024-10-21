package Section12.SolidPrinciples.O.Solution;

public class PersonalLoanHandler implements LoanHandler {

    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if (validator.isValid(user)) {
            // process with loan approval
        }
    }
}