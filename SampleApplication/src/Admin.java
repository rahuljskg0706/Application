package myAdmin;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
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
