package lv.javaguru.lesson10.uservalidationservice;

public class UserValidationService {

    boolean noErrors;
    int validationTries = 0;

    public void validate(User user) {

        validationTries++;
        noErrors = true;

        try {
            validateName(user.getFirstName(), "first name");
        } catch (UserValidationException e) {
            ifError(e, user);
        }
        if (noErrors) {
            try {
                validateName(user.getLastName(), "last name");
            } catch (UserValidationException e) {
                ifError(e, user);
            }
        }
        if (noErrors) {
            try {
                validateAge(user.getAge());
            } catch (UserValidationException e) {
                ifError(e, user);
            }
        }
        if (noErrors) {
            User.setNr(User.getNr() + 1);
            user.setId(User.getNr());
            System.out.println("New user has been successfully added to the system:");
            System.out.println(user);
            System.out.println();
        }
    }

    public void ifError(UserValidationException e, User user) {
        noErrors = false;
        System.out.println(e.getMessage());
        System.out.println("Cannot register " + user.toStringShort() + " into the system.");
        System.out.println();
    }

    public void validateName(String name, String nameTitle) throws UserValidationException {
        if (name.length() < 3)
            throw new UserValidationException("The " + nameTitle + " must not be shorter than 3 characters!");
        if (name.length() > 15)
            throw new UserValidationException("The " + nameTitle + " must not be longer than 15 characters!");
    }

    public void validateAge(int age) throws UserValidationException {
        if (age < 0) throw new UserValidationException("Only positive age is eligible!");
        if (age > 120)
            throw new UserValidationException("The system is not ready for such long-living users! Our limit is 120 years old!");
    }
}
