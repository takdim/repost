public class Person {

    String name;
    int age;
    String gender;

    public void isMale(){
        this.isMale();
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void Gender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void cetak(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.name = "naruto";
        p.age = 25;
        p.gender = "pria";
        
        p.cetak();

    }
}