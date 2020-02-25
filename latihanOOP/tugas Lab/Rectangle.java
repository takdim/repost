public class Rectangle{
    double height;
    double width;

    double getArea(){
        double hasil = height * width;
        return hasil;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Rectangle rec2 = new Rectangle();

        
        rec.height= 50;
        rec.width = 3;
        rec2.height = 20;
        rec2.width = 3;
        System.out.println("Luas = " + rec.getArea());
        System.out.println("Luas = " + rec2.getArea());
    }
}
