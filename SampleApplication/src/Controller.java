
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Validate{
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
	
		
			
		
		
		
		
	boolean check(int value)
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
	
	
class User {
	
		void view()
		{
			System.out.println("List of Items Available");
			System.out.println();
			
		}
	
	
}


class Admin{
	
	public void add()
	{
		int i=0, j=1;
		List<String> ls = new ArrayList<String>();
		
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Select any category to Add");
		
		ls.add("Shoes");
		ls.add("Mobile Phones");
		ls.add("Shirts");
		ls.add("Tshirts");
		

		for(String s : ls)
		{
			System.out.println(j+"."+s);
			j++;
		}
		
		String fileName = "newfile.txt";
		String line = null;
		
	     try {
		    
		     
		     FileWriter fw = new FileWriter(fileName);
	    	  BufferedWriter bw=new BufferedWriter(fw);
	    	  
	    	 
	    	  bw.close();
	    	  fw.close();

		     } 
	     	catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }
		 
/*		  
	     try {
	    	  FileWriter fw = new FileWriter("newfile.txt");
	    	  BufferedWriter bw=new BufferedWriter(fw);
	    	 
	    	  for(String s : ls)
	    	  {
	    		 bw.append(s);  
	    	  }
	    	  bw.close();
	    	  fw.close();

	     }
	     catch(IOException e)
	     {
	    	System.out.println("Exception Occured");
	    	e.printStackTrace();
	     }
	   
	   */  
	}
}

	

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

