import java.util.Scanner;
class HargaBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kodeBarang = sc.nextInt();
        int jlhBarang = sc.nextInt();

        switch(kodeBarang){
            case 1 :
            System.out.println("Total : "+4000*jlhBarang);
            break;
            case 2:
            System.out.println("Total : "+4000*jlhBarang);
            break;
            case 3:
            System.out.println("Total : "+2000*jlhBarang);
            break;
            case 4:
            System.out.println("Total : "+1000*jlhBarang);
            break;
            default:
            break;
        } 

        
    }
}