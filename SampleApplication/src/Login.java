package  myLogin;
import java.util.Scanner;
import myval.Validate;
import myAdmin.Admin;
import myUser.User;

public class Login  {


    public Login(){
        System.out.println("Please Enter 0 or 1");
        System.out.println("0.User Session");
        System.out.println("1.Admin Session");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Validate validate = new Validate();
        Boolean bool = validate.check(n);
        System.out.println("Login");
        System.out.println("");
        System.out.println("Enter the Username");
        String username = sc.next();
        System.out.println("");
        System.out.println("Enter the Password");
        String password = sc.next();
        Boolean b = validate.login(username, password, bool);
        sc.close();
        if(b) {

            Admin admin = new Admin();
            User user = new User();

            if(bool)
            {
                admin.add();
            }
            else
            {
                user.view();
            }
        }
    }




}
