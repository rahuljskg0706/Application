import java.io.*;
import java.util.ArrayList;

class Shoe  implements Serializable{
    int model_id;
    String model;
    int quantity;

    public Shoe(int id, String model, int quantity){
        this.model_id = id;
        this.model = model;
        this.quantity = quantity;

    }



}

public class Shoedet {

    private static final String filepath="sc.ser";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Shoedet shobj = new Shoedet();
        ArrayList<Shoe> ad = (ArrayList) shobj.ReadObjectFromFile(filepath);

        ArrayList<Shoe> sdo = shoeAdd(ad);


        shobj.WriteObjectToFile(sdo);
        ArrayList<Shoe> ads = (ArrayList) shobj.ReadObjectFromFile(filepath);

        System.out.println(ads);
        for(Shoe a: ads){
            System.out.println(a.model_id);
        }




    }
    public static ArrayList<Shoe>  shoeAdd(ArrayList<Shoe> ar) throws IOException, ClassNotFoundException {
       /* System.out.println("Enter model id");
        Scanner sc = new Scanner((System.in));
        int mid = sc.nextInt();
        System.out.println("Enter model name");
        String  mname = sc.next();
        System.out.println("Enter model quantity");
        int mquantity = sc.nextInt();*/
        Shoe a = new Shoe(15, "nike", 30);
        Shoe b = new Shoe(47, "puma", 30);



        ArrayList<Shoe> sh = ar;
        sh.add(a);
        sh.add(b);

//        sc.close();

        return  sh;
    }







    public void WriteObjectToFile(Object serObj) {

        try {


            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Object ReadObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }



}
