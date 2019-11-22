import java.util.Scanner;
class Average1{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        float A = pew.nextFloat();
        float B = pew.nextFloat();

        float MEDIA =(float) ((A * 3.5) + (B * 7.5))/11;

        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println();
    }
}