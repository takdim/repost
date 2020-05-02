public class Runner implements Runnable {
    private Integer number;
    private Thread thread;
    private Race race;

    public Runner(Integer number) {
        this.number = number;
        thread = new Thread(this);
    }

    public Runner joinRace(Race race) {
        if (this.race == null) {
            this.race = race;
            race.participant++;
        }
        return this;
    }

    public String getNumber() {
        return String.format("Runner-%d", number);
    }

    public void start() {
        if (race.isStart) {
            thread.start();
        } else {
            System.out.printf("Hey Runner-%d, the race hasn't started yet!\n", number);
        }
    }

    @Override
    public void run() {
        System.out.printf("%s running\n", getNumber());
        try {
            Thread.sleep(race.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        race.ranking.add(getNumber());
    }
}