import java.util.*;
import java.io.*;

class Praktikum2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        FileReader lili = null;
        BufferedReader lolo = null;
        FileWriter lala = null;
        PrintWriter lele = null;

        try {
            lili = new FileReader(pew.next() + ".txt");
            lolo = new BufferedReader(lili);
            lala = new FileWriter(pew.next() + ".txt");
            lele = new PrintWriter(lala);
            if(lala.equals(lele)){
                System.out.println("file tidak boleh sama");
            }
            String a;
            while((a= lolo.readLine()) != null){
                lele.write(String.format("%20s\n", a));
            }
        
        } catch (IOException e) {
            System.out.println("gagal");
        }finally{
            try{
                if (lala != null){
                    System.out.println("berhasil");
                    lala.close();
                }
                if(lele != null){
                    lele.close();
                }
            }catch(IOException ioe){
                System.out.println("gagal");
            }
        }
    }
}