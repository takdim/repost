/**
 * Mahasiswa
 */
public class Mahasiswa implements ProgramStudi{

    private String name;
    private String prodi;
    private String nim;
    private int uas;
    private int uts;

    public Mahasiswa (String name, String nim, String prodi, int uas, int uts){
        this.name = name;
        this.nim = nim;
        this.uts = uts;
        this.uas = uas;
        this.prodi = prodi;
    }

    public String getName() {
        return this.name;
    }
    
    public String getProdi() {
    	return this.prodi;
    }
    
    public String getNim() {
    	return this.nim;
    }
    
    public int getUas() {
    	return this.uas;
    }
    
    public int getUts() {
    	return this.uts;
    }

    @Override
    public void prodi(String value, int data) {
        System.out.println("SKS         : " + data);
        System.out.println("Dosen       : " + value);
    }
    
    public double score(int uts, int uas){
        return (uas+uts)/2;
    }
    
    public void info(){
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + name);
        System.out.println("Mata Kuliah : " + prodi);
    }
    public void nilai(){
        System.out.println("UTS         : " + uts);
        System.out.println("UAS         : " + uas);
        System.out.println("Nilai Akhir : " + score(uts, uas));
        if (score(uts, uas) > 90){
            System.out.println("Nilai Mutu  : A" );
        } else if (score(uts, uas) > 80){
            System.out.println("Nilai Mutu  : B");
        } else if (score(uts, uas) > 70){
            System.out.println("Nilai Mutu  : C");
        } else if (score(uts, uas) > 60){
            System.out.println("Nilai Mutu  : D");
        } else{
            System.out.println("Nilai Mutu  : E");
        }
    }

}