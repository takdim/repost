/**
 * Main
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hanya ada 2 burger
        //sapi dan nugget
        //harga burger sapi adalah 18.000 sedangkan burger nugger adalah 15.000
        //dengan tambahan 
        System.out.println();
        boolean turn = false;
        while(true){
            System.out.println("rasa sapi? nugget?");
            String rasa = sc.next().toLowerCase();
            System.out.println("jumlah pesanan?");
            int jumlah = sc.nextInt();
            Addition tambah = new Addition();
            while(true){
                System.out.println("mau tambahan? y/n");
                String t = sc.next().toLowerCase();
            
                if(rasa.equals("sapi")){
                    System.out.println();
                    if(t.equals("y")){
                    boolean tambahan = true;
                    if(tambahan){
                        System.out.println("mau tambahan apa?");
                        System.out.println("1. drink");
                        System.out.println("2. saus");
                        System.out.println("3. potato");
                        System.out.println("4. tomato");
                        int choose = sc.nextInt();
                    
                        if(choose == 1){
                        //drink    
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah minuman ?");
                                int ch = sc.nextInt();
                                tambah.setDrink(ch);
                                System.out.println("masih ingin nambah minuman? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setDrink(ch);
                                    turn = true;
                                }
                            }    
                        }
                        else if(choose == 2){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah saus ?");
                                int ch = sc.nextInt();
                                tambah.setSaus(ch);
                                System.out.println("masih ingin nambah saus? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                tambah.setSaus(ch);
                                turn = true;
                                }
                            }
                        
                        }else if(choose == 3){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah potato ?");
                                int ch = sc.nextInt();
                                tambah.setPotato(ch);
                                System.out.println("masih ingin nambah potato? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setPotato(ch);
                                    turn = true;
                                }
                            }
                        }else if(choose == 4){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah tomato ?");
                                int ch = sc.nextInt();
                                tambah.setSaus(ch);
                                System.out.println("masih ingin nambah tomato? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setTomato(ch);
                                    turn = true;
                                }
                            }
                        }
                    }
                    
                    }else{
                        BurgerSapi sapi = new BurgerSapi(rasa, jumlah);
                        System.out.println("anda memesan burger " + sapi.rasa);
                        System.out.println("total burger    : " + jumlah);
                        //System.out.println("tambahan        : " );
                        System.out.println("harga burger    : " + sapi.harga);
                        System.out.println("total harga     : " + (sapi.harga + tambah.harga));
                        break;
                    }
            
                }else{
                    System.out.println();
                    if(t.equals("y")){
                    boolean tambahan = true;
                    if(tambahan){
                        System.out.println("mau tambahan apa?");
                        System.out.println("1. drink");
                        System.out.println("2. saus");
                        System.out.println("3. potato");
                        System.out.println("4. tomato");
                        int choose = sc.nextInt();
                    
                        if(choose == 1){
                        //drink    
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah minuman ?");
                                int ch = sc.nextInt();
                                tambah.setDrink(ch);
                                System.out.println("masih ingin nambah minuman? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setDrink(ch);
                                    turn = true;
                                }
                            }    
                        }
                        else if(choose == 2){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah saus ?");
                                int ch = sc.nextInt();
                                tambah.setSaus(ch);
                                System.out.println("masih ingin nambah saus? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                tambah.setSaus(ch);
                                turn = true;
                                }
                            }
                        
                        }else if(choose == 3){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah potato ?");
                                int ch = sc.nextInt();
                                tambah.setPotato(ch);
                                System.out.println("masih ingin nambah potato? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setPotato(ch);
                                    turn = true;
                                }
                            }
                        }else if(choose == 4){
                            turn = false;
                            while(!turn){
                                System.out.println("jumlah tomato ?");
                                int ch = sc.nextInt();
                                tambah.setSaus(ch);
                                System.out.println("masih ingin nambah tomato? y/n");
                                String nambah = sc.next().toLowerCase();
                                if(nambah.equals("n")){
                                    tambah.setTomato(ch);
                                    turn = true;
                                }
                            }
                        }
                    }
                    
                    }else{
                        BurgerNugget nuget = new BurgerNugget(rasa, jumlah);
                        System.out.println("anda memesan burger " + nuget.rasa);
                        System.out.println("total burger    : " + jumlah);
                        //System.out.println("tambahan        : " );
                        System.out.println("harga burger    : " + nuget.harga);
                        System.out.println("total harga     : " + (nuget.harga + tambah.harga));
                        break;
                    }
                }
            }
            break;
        }
    }
}