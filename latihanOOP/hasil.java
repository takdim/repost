import java.util.Scanner;
public class hasil{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        Box box1 = new Box();
        //System.out.println(box1.getHeight());
        box1.setHeight(pew.nextDouble());
        box1.setWidht(pew.nextDouble());
        box1.setDepth(pew.nextDouble());
        box1.setName(pew.next());
        box1.getVolume();
        box1.setDesc();
    }
}