package myval;
public class Validate {

    public String user_name ;
    private String user_password ;
    public String admin_username ;
    private String admin_password ;


    public boolean login(String uname, String upwd, boolean b)
    {
        String str = uname.substring(0, 3);
        String str1 = upwd.substring(0, 3);

        if(b)
        {
            if(uname.length() < 5 || upwd.length() < 8)
            {
                System.out.println("Your Username or Password is incorrect");
                return false;
            }
            else if(str.equals(str1))
            {
                System.out.println("Admin has logged in Successfully");
                return true;
            }
            else
            {
                System.out.println("Admin Login Unsuccessful, Please try again.");
                return false;
            }
        }
        else
        {
            String s1 = uname.substring(uname.length()-3, uname.length()-1);
            String s2 = upwd.substring(upwd.length()-3, upwd.length()-1);

            if(uname.length() < 5 || upwd.length() < 8)
            {
                System.out.println("Your Username or password is incorrect");
                return false;
            }
            else if(s1.equals(s2))
            {
                System.out.println("User has logged in Successfully");
                return true;
            }
            else
            {
                System.out.println("User Login Unsuccessful, Please Try again");
                return false;

            }
        }

    }







    public boolean check(int value)
    {
        if(value == 0)
        {
            System.out.println("User Session");
            System.out.println("");
            return false;

        }
        else if(value==1)
        {
            System.out.println("Admin Session");
            System.out.println("");
            return true;
        }
        else
        {
            System.out.println("Please Enter a Valid ID ");
        }

        return true;

    }

}
