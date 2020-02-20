import java.util.Map;
import java.util.Random;
public class Student{
    private String id;
    private String firstName;
    private String lastName;
    
    private String email;
    private int registerYear;
    private String faculty;
    private String departemen;
    private String major;

    public void setId(Map<String, String>facultyMap, Map<String, String>majorMap){
    Random randoms = new Random();
    this.id = facultyMap.get(faculty) + majorMap.get(major) + "1" + String.valueOf(registerYear).substring(2) + "1" + String.format("%03d", randoms.nextInt(061));
    }
    public String getId(){
        return id;
    }
    public void setFirstName(String firstName){

        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFullName(){
        String fullName[] = (firstName.toLowerCase() + " " + lastName.toLowerCase()).split(" ");
        String Name = "";
        for (int i = 0; i < fullName.length;i++) {
            Name+= fullName[i].substring(0,1).toUpperCase()+ fullName[i].substring(1) + " ";
        }
        return Name;
    }
    public void setEmail(Map<String, String>facultyMap){
        String fullName[] = (firstName.toLowerCase() + " " + lastName.toLowerCase()).split(" ");
        String Name = "";
        for (int i = 0; i < fullName.length -1;i++) {
            Name+= fullName[i].substring(0,1);
        }
        this.email = (fullName[fullName.length - 1]+ Name + String.valueOf(registerYear).substring(2) + facultyMap.get(faculty) + "@gmail.com").toLowerCase();
    }
    public String getEmail(String email){
        return email;
    }
    public void setRegisterYear(Integer registerYear){
        this.registerYear = registerYear;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getFaculty(String faculty){
        return faculty;
    }
    public void setDepartment(String departemen){
        this.departemen = departemen;
    }
    public String getDepartment(String departemen){
        return departemen;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public void description() {
        System.out.println("Nama            : " + getFullName() );
        System.out.println("NIM             : " + getId());
        System.out.println("Email Mahasiswa : " + getEmail(email));
        System.out.println("Fakultas        : " + getFaculty(faculty));
        System.out.println("Departemen      : " + getDepartment(departemen));
        System.out.println("Program Studi   : " + getMajor());
        System.out.println();
    }
}