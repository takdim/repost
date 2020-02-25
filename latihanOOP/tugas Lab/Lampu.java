public class Lampu {

    boolean blueIsOn;
    boolean redIsOn;

    void turnOn() {
        if(blueIsOn == redIsOn){
            blueIsOn = true;
            redIsOn = false;
        }else if(blueIsOn == true && redIsOn == false){
            blueIsOn = false;
            redIsOn  = true;
        }else{
            blueIsOn = true;
            redIsOn = false;
        }
    }

    void turnOff() {
        blueIsOn = false;
        redIsOn = false;
    }
  
    void getStatus() {
      System.out.println(blueIsOn == true ? "blue is on" : "blue is off");
      System.out.println( redIsOn == true ? "red is on" : "red is off");
      System.out.println();
    }


    public static void main(String[] args) {
        Lampu lamp1 = new Lampu();
        
        lamp1.turnOn();
        lamp1.getStatus();
        lamp1.turnOff();
        lamp1.getStatus();
        lamp1.turnOn();
        lamp1.getStatus();

        

    }
}