import java.io.*;
import java.util.*;

class Praktikum1{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        FileInputStream in =null;
        FileOutputStream out =null;
        try{
            in= new FileInputStream(pew.next());
            out = new FileOutputStream(pew.next());
            int data;
            while((data = in.read()) != -1){
                out.write(data);
            }
        }catch(IOException ioe){
            System.out.println("gagal");
        }finally{
            try {
                if(in != null){
                    System.out.println("berhasil");
                    in.close();
                }
                if(out != null){
                    
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("gagal");
                
            }
        }
    }
}