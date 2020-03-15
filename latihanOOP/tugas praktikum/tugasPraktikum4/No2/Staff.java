/**
 * Staff
 */
public class Staff extends PengurusInti{
    //String jebeten;
    public Staff(String name, String prodi, String nim) {
        super(name, prodi, nim);
    }
    @Override
    public void showIdentity() {System.out.println();
        System.out.println("+===========================+");
        System.out.println("nama    : " + name);
        System.out.println("nim     : " + nim);
        System.out.println("prodi   : " + prodi);
        System.out.println("kamu adalah staff");
        System.out.println("+===========================+");
    }

    
}