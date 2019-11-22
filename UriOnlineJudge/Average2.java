import java.util.*;
class Average2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        float A = pew.nextFloat();
        float B = pew.nextFloat();
        float C = pew.nextFloat();

        float MEDIA = (float)((A*2) + (B*3) + (C*5))/10;
        System.out.printf("MEDIA = %,.1f" ,MEDIA);
        System.out.println();
    }
}