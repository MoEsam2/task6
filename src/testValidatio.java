import java.util.Scanner;

public class testValidatio {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String Email;
        String password;
        System.out.println("Enter your email :");
        Email=in.nextLine();
        System.out.println("Enter your Password :");
        password=in.nextLine();
        ValidationClass validation=new ValidationClass();
        ResultClass resultPass=validation.validatePassword(password);
        ResultClass resultEmail=validation.validateEmail(Email);
        if(resultEmail.isValid() && resultPass.isValid())
            System.out.println(resultPass.getMessage());
        else if(resultEmail.isValid() && !resultPass.isValid())
            System.out.println(resultPass.getMessage());
        else if(!resultEmail.isValid() && resultPass.isValid())
            System.out.println(resultEmail.getMessage());
        else
        {
            System.out.println(resultEmail.getMessage());
            System.out.println(resultPass.getMessage());
        }

    }
}
