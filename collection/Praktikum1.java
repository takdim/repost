import java.util.*;
class Praktikum1{

    private static HashMap<Integer,String> judul  = new HashMap<>();
    private static HashMap<Integer,String> rilis = new HashMap<>();
    private static HashMap<Integer,String> durasi = new HashMap<>();
    private static HashMap<Integer,String> genre =  new HashMap<>();
    private static HashMap<Integer,String> sinopsis = new HashMap<>();
    private static HashMap<Integer,String> cast = new HashMap<>();
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String hh = "y";
        //avenger
        judul.put(1, "avenger");
        rilis.put(1, "24 april 2018");
        durasi.put(1, "2 jam 1 menit");
        genre.put(1, "Adventure, sci-fi");
        sinopsis.put(1, "lawan thanos");
        cast.put(1, "robert downey jr");
        //spiderman
        judul.put(2, "spiderman");
        rilis.put(2, "02 juli 2019");
        durasi.put(2, "2 jam 15 menit");
        genre.put(2, "Adventure,sci-fi");
        sinopsis.put(2, "spiderman jauh dari rumah");
        cast.put(2, "tom holland");
        //venom
        while(hh.equalsIgnoreCase("y")){
            System.out.println("    (d)Detail   (s)Search   (a)Add  (r)Remove   (e)exit" );
            String pilihan = pew.next();
            switch(pilihan){
                case "d":
                int detil = pew.nextInt();
                System.out.println();
                detail(detil);
                break;
                case "r":
                int remov = pew.nextInt();
                System.out.println();
                remove(remov);
                break;
                case "s":
                String cari = pew.next();
                System.out.println("hasil cari = " + cari);
                for (int i = 1; i < judul.size() ; i++) {
                    if(judul.get(i).contains(cari)){
                        System.out.println(judul.keySet().toArray()[i-1]);
                        System.out.println(judul.get(judul.keySet().toArray()));
                    }
                    System.out.println();
                }
                break;
                case "a":
                System.out.println("masukkan data untuk film baru");
                System.out.println("key");
                int ahaha = pew.nextInt();
                System.out.println("judul");
                pew.nextLine();
                String asi = pew.nextLine();
                System.out.println("jadwal rilis");
                judul.put(ahaha, asi);
                asi = pew.nextLine();
                rilis.put(ahaha, asi);
                System.out.println("durasi film");
                asi = pew.nextLine();
                durasi.put(ahaha, asi);
                System.out.println("genre");
                asi = pew.nextLine();
                genre.put(ahaha, asi);
                System.out.println("sinopsis");
                asi = pew.nextLine();
                sinopsis.put(ahaha, asi);  
                System.out.println("cast");
                asi = pew.nextLine();
                cast.put(ahaha, asi);
                break;
                
            }
            System.out.println("next? press y \nexit? press e");
            hh = pew.next();
        }
        
       
    }
    //detail
    public static void detail(int a){
        System.out.println("judul  : " + judul.get(a));
        System.out.println("rilis  : "+ rilis.get(a));
        System.out.println("durasi : " + durasi.get(a));
        System.out.println("genre  : " + genre.get(a));
        System.out.println("sinopsis : " + sinopsis.get(a));
        System.out.println("cast   : " + cast.get(a));
    }
    public static void remove(int a) {
        judul.remove(a);
        rilis.remove(a);
        durasi.remove(a);
        genre.remove(a);
        sinopsis.remove(a);
        cast.remove(a);
    }
    public static void nama(String a) {
        System.out.println("fav movie");
        for (int i = 0;i<judul.size();i++) {
            System.out.println(judul.keySet().toArray()[i]);
            System.out.println(judul.get(judul.keySet().toArray()[i]));
        }
    }
    // public static void add (int a, String b){
    //     System.out.println("judul : ");
    //     judul.put(a, b);
    //     System.out.println("rilis : ");
    //     rilis.put(a, b);
    //     System.out.println("durasi : ");
    //     durasi.put(a, b);
    //     System.out.println("genre : ");
    //     genre.put(a, b);
    //     System.out.println("sinopsis : ");
    //     sinopsis.put(a, b);
    //     System.out.println("cast : ");
    //     cast.put(a, b);
    // }

}