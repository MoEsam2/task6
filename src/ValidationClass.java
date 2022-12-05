import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidationClass {

    public ResultClass  validateEmail(String Email)
    {
        ResultClass emailResult=new ResultClass();
        emailResult.setValid(isEmailValid(Email));
        emailResult.setMessage(emailMessage(Email));


        return emailResult;
    }
    public ResultClass  validatePassword(String password)
    {
        ResultClass passwordResult=new ResultClass();

        passwordResult.setValid( isPasswordValid(password));
        passwordResult.setMessage(passwordMessage(password));

        return passwordResult;
    }
    private static boolean isPasswordValid(String str) {
        if(str.isEmpty())
            return false;
        else
        {
            if (str.length() > 20 || str.length() < 8)
                return false;
            else {
                int countUpperCase = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLetter(str.charAt(i))) {
                        if (Character.isUpperCase(str.charAt(i)))
                            countUpperCase++;
                    } else
                        return false;
                }
                if (countUpperCase == 0)
                    return false;
                else
                    return true;


            }
        }
    }
    private static String passwordMessage(String str) {
        if (str.isEmpty())
            return "Password should not be empty";
        else
        {
            if (str.length() > 20 || str.length() < 8)
                return "password should be between 8 and 20 character";
            else {
                int countUpperCase = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLetter(str.charAt(i))) {
                        if (Character.isUpperCase(str.charAt(i)))
                            countUpperCase++;
                    } else
                        return "password should be character";
                }
                if (countUpperCase == 0)
                    return "password should contain at least 1 Capital Letter";


            }
            return "signed up";
        }
    }
    public static boolean isEmailValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static String emailMessage(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email.isEmpty())
            return "Email should not be empty";
        else
        {
            if (!pat.matcher(email).matches())
                return "email should follow this pattern ( **@*.*)";
        }
        return "signed up";
    }
}
