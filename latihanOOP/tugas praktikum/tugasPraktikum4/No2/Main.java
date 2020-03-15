/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        //jika koordinator, maka yang jalan adalah if
        //else staff
        System.out.println();
        System.out.println("====== masukkan kode =======");
        String keyword = pew.next().toLowerCase();
        if(keyword.equals("syahdunya")){
            System.out.println("name");
            pew.nextLine();
            String name = pew.nextLine();
            System.out.println("prodi");
            String prodi = pew.nextLine();
            System.out.println("nim");
            String nim = pew.next();
            PengurusInti pengurus = new PengurusInti(name, prodi, nim);
            
            pengurus.showIdentity();
        }
        else{
            System.out.println("name");
            pew.nextLine();
            String name = pew.nextLine();
            System.out.println("prodi");
            String prodi = pew.nextLine();
            System.out.println("nim");
            String nim = pew.next();
            Staff staff = new Staff(name, prodi, nim);
            staff.showIdentity();
        }
    }
}