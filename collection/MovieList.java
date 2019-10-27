import java.util.*;

public class MovieList {


    public static void main(String[] args)  

    {
        System.out.println("Welcome to the Movie List Application");
        System.out.println();
        System.out.println("There are 100 movie in the list");
        String choice = "y";
        Scanner sc = new Scanner(System.in);

        ArrayList<String> animated = new ArrayList<>();
         animated.add("Robot Chicken");
         animated.add("Family Guy");
         animated.add("American Dad");
         animated.add("Bob's Burgers");
         animated.add("The Simpsons");


         ArrayList<String>drama = new ArrayList<>();
         drama.add("John Q");
         drama.add("The Green Mile");
         drama.add("The Breakfast Club");
         drama.add("The Shawshank Redemption");
         drama.add("Braveheart");

         ArrayList<String> horror = new ArrayList<>();
         drama.add("Scream");
         drama.add("Carrie");
         drama.add("Insideous");
         drama.add("Insideous");
         drama.add("Sinister");

         ArrayList<String> scifi = new ArrayList<>();
         scifi.add("The Book of Eli");
         scifi.add("Daybreakers");
         scifi.add("Hunter Prey");
         scifi.add("Predators");
         scifi.add("Skyline");

        while(choice.equalsIgnoreCase("y"))
            {
            System.out.print("What category are you interested in?");

                    String movielist = sc.nextLine();
                    switch (movielist) {
                        case "animated":
                            System.out.println(animated);
                            break;
                        case "drama":
                            System.out.println(drama);
                            break;
                        case "horror":
                            System.out.println(horror);
                            break;
                        case "scifi":
                            System.out.println(scifi);
                            break;
                    }

            System.out.print("Continue? y/n): ");
            choice = sc.next();
            }
                    }


    }