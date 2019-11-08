import java.util.*;
import java.io.*;
public class Praktikum3 {
    static Scanner pew = new Scanner (System.in);
    public static void main(String[] args) throws IOException  {
        boolean benar = true;

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        System.out.println("nama file");
        String fileName = pew.nextLine()+".txt";

        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String s;
        String readFile ="";
        int counter = 1;
        while((s=br.readLine())!=null){
            if(s.equals("+----------------------+------------+----------+")){
                if(counter == 1 || counter == 3){
                 readFile = readFile+s+"\n";   
                }
                else{
                    break;
                }
            
            }
            else{
                readFile += s+"\n";
            }
            counter++;

        }
        if(fr!=null){
            fr.close();
        }
        if(br!=null){
            br.close();
        }
        try {
        System.out.println("jumlah yang ingin di tambahkan");
        int sum = pew.nextInt();
        String name [] = new String [sum];
        String nim [] = new String [sum];
        int angkatan [] = new int [sum];
        for(int i=0; i<sum; i++){
            System.out.println("nama");
            name [i] = pew.next().replace("_", " ");
            System.out.println("Nim");
            nim [i] = pew.next();
            System.out.println("Angkatan");
            angkatan [i] = pew.nextInt(); 
        }
        fw = new FileWriter(fileName);
        pw = new PrintWriter(fw);
        pw.write(readFile);
        for(int i=0; i<sum; i++){
            pw.printf("| %-20s | %-10s | %-8d |%n",name[i],nim[i],angkatan[i]);
        }
        pw.write("+----------------------+------------+----------+");
        if(fw != null){
            fw.close();
        }
        if(pw != null){
            pw.close();
        }
        } catch (Exception e) {
            benar = false;
        } finally{
            System.out.println();
            if(benar== true){
                System.out.println("Berhasil");
            }else{
                System.out.println("Gagal");
            }
        }
    }
}