import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String pass=in.nextLine();
        System.out.println(isStringValid(pass));
        System.out.println(passwordMessage(pass));
    }
    private static boolean isStringValid(String str) {
        if (str.length() > 20 || str.length() < 8)
            return false;
        else
        {
            int countUpperCase = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (Character.isLetter(str.charAt(i))) {
                    if (Character.isUpperCase(str.charAt(i)))
                        countUpperCase++;
                }
                else
                    return false;
            }
            if (countUpperCase == 0)
                return false;
            else
                return true;


        }
    }
    private static String passwordMessage(String str) {
        if (str.length() > 20 || str.length() < 8)
            return "password should be between 8 and 20 character";
        else
        {
            int countUpperCase = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (Character.isLetter(str.charAt(i))) {
                    if (Character.isUpperCase(str.charAt(i)))
                        countUpperCase++;
                }
                else
                    return "password should be character";
            }
            if (countUpperCase == 0)
                return "password should contain at least 1 Capital Letter";



        }
        return "signed up";
    }

}
