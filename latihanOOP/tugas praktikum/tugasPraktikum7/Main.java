/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        
        Integer number = 0;
        Race race = new Race();
        Runner[] runners = new Runner[10];

      
        for (int i = 0; i < runners.length; i++) {
            runners[i] = new Runner(++number);
            runners[i].joinRace(race);
        }
            
        race.start();
                 
        for (Runner runner : runners) {
            runner.start();
        }
       
        race.result();

        
        
    }
}