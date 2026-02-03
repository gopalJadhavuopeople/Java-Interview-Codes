package GopalPracticePkg;

public class EmailValidation {

    //gopal@yahoo.com
    //@ should not be a first and last element
    //dot should after @
    public static void main(String[] args) {


        String emailId = "gopal@yahoo.com";

        int indexOfAt = emailId.indexOf('@');
        int indexOfDot = emailId.indexOf('.');
        int fisrtIndex = emailId.indexOf(emailId);
        int lastIndex = emailId.lastIndexOf(emailId);


        if (indexOfAt != fisrtIndex && indexOfAt != lastIndex && indexOfAt < indexOfDot) {

            System.out.println("Valid Email");

        } else {
            System.out.println("Invalid Email");
        }


    }
}