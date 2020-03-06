import java.util.*;
/**
 * runner
 */
public class runner {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        
        double width = pew.nextDouble();
        double height = pew.nextDouble();
        double depth = pew.nextDouble();
        double mass = pew.nextDouble();

        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("massa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("massa jenis = " + box.getDensity());
        pew.close();
    }
}