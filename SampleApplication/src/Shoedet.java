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
    public static void main(String[] args){

        Shoedet shobj = new Shoedet();
        ArrayList<Shoe> sdo = shoeAdd();
        shobj.WriteObjectToFile(sdo);
        ArrayList<Shoe> ad = (ArrayList) shobj.ReadObjectFromFile(filepath);
        System.out.println(ad);
        for(Shoe a: ad){
            System.out.println(a.model_id);
        }




    }
    public static ArrayList  shoeAdd(){
       /* System.out.println("Enter model id");
        Scanner sc = new Scanner((System.in));
        int mid = sc.nextInt();
        System.out.println("Enter model name");
        String  mname = sc.next();
        System.out.println("Enter model quantity");
        int mquantity = sc.nextInt();*/
        Shoe a = new Shoe(1, "nike", 30);
        Shoe b = new Shoe(2, "puma", 30);

        ArrayList<Shoe> sh = new ArrayList<>();
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
