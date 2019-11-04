import java.util.*;
class Praktikum1coba{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> favMovie = new HashMap<>();
        favMovie.put("judul", new ArrayList<>());
        favMovie.put("rilis", new ArrayList<>());
        favMovie.put("durasi", new ArrayList<>());
        favMovie.put("genre", new ArrayList<>());
        favMovie.put("sinopsis", new ArrayList<>());
        favMovie.put("cast", new ArrayList<>());
        String hh = "n";
        while (hh.equalsIgnoreCase("n")) {
            tampilkan(favMovie);
            System.out.println(" (d)Detail  (s)Search   (a)Add  (r)Remove");
            String inp = pew.next();
            switch (inp) {
                case "s":
                String  hahaha = pew.next();
                System.out.printf(cari(hahaha, favMovie));
                System.out.println("berhenti? (y/n");
                hh = pew.next();
                break;
                case "d":
                    int pak = pew.nextInt()-1;
                    detail(favMovie, pak);
                    System.out.println("berhenti? (y/n)");
                    hh = pew.next();
                    break;
                case "a":
                    add(favMovie);
                    tampilkan(favMovie);
                    System.out.println("berhenti? (y/n)");
                    hh = pew.next();
                    break;
                case "r":
                    int ha = pew.nextInt();
                    remove(favMovie, ha);
                    tampilkan(favMovie);
                    System.out.println("berhenti? (y/n");
                    hh = pew.next();
                    break;

                default:
                    System.out.println("berhenti? (y/n)");
                    hh = pew.next();
                    break;
            }

        }
    }
    static void tampilkan (HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> judul = favMovie.get("judul");
        System.out.println("favourite movie");
        for (int i = 0; i < judul.size(); i++) {
            System.out.println(i+1 + ". " + judul.get(i));
        }
    }
    static void detail(HashMap<String, ArrayList<String>> favMovie, int i){
        
        System.out.println("judul    : " + favMovie.get("judul").get(i));
        System.out.println("rilis    : " + favMovie.get("rilis").get(i));
        System.out.println("durasi   : " + favMovie.get("durasi").get(i));
        System.out.println("genre    : " + favMovie.get("genre").get(i));
        System.out.println("sinopsis : " + favMovie.get("sinopsis").get(i));
        System.out.println("cast     : " + favMovie.get("cast").get(i));
    }
    static void add (HashMap<String, ArrayList<String>> favMovie){
        pew.nextLine();
        System.out.println("judul: ");
        String title = pew.nextLine();
        System.out.println("rilis: ");
        String realease = pew.nextLine();
        System.out.println("durasi");
        String duration = pew.nextLine();
        System.out.println("genre: ");
        String jenre = pew.nextLine();
        System.out.println("sinopsis: ");
        String synopsis = pew.nextLine();
        System.out.println("cast: ");
        String casting = pew.nextLine();

        favMovie.get("judul").add(title);
        favMovie.get("rilis").add(realease);
        favMovie.get("durasi").add(duration);
        favMovie.get("genre").add(jenre);
        favMovie.get("sinopsis").add(synopsis);
        favMovie.get("cast").add(casting);
    }
    static String cari (String hwe, HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> judul = favMovie.get("judul");
        String out = "hasil ("+ hwe +")\n";
        for (int i = 0; i < judul.size(); i++) {
            String movie = judul.get(i);
            for (int j = 0; j < movie.length(); j++) {
                if(j+hwe.length() <= movie.length()){
                    if(hwe.equalsIgnoreCase(movie.substring(j,j+hwe.length()))){
                        out += String.format(i+1 + ", " +movie + "\n");
                        break;
                    }

                }
                else{
                    continue;
                }
            }
        }
        return out;
    }
            static void remove(HashMap<String, ArrayList<String>> favMovie, int ha){
                favMovie.get("judul").remove(ha);
                favMovie.get("rilis").remove(ha);
                favMovie.get("durasi").remove(ha);
                favMovie.get("sinopsisl").remove(ha);
                favMovie.get("genre").remove(ha);
                favMovie.get("cast").remove(ha);
        
            }
    
    
}