public class Frog {
    private String color;
    private int jump;

    public Frog(String color, int jump) {
        this.color = color;
        this.jump = jump;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setJump(int jump){
        this.jump = jump;
    }
    public int getJump(){
        return jump;
    }

    public boolean getRun(Field field) {
        getProses(field);
        return true;
    }

    public void getProses(Field field) {
        int pijakan = 0;

        for(int i = 0; i < 10; i++){
            if(field.getTinggiBambu(i) - pijakan < jump){
                System.out.println("kodok " + i + " berhasil lompati bambu ke " + i);
            } else if(field.getTinggiBambu(i) - pijakan >= jump){
                System.out.println("kodok gagal lompati bambu ke " + i);
                break;
            }
            if(field.getTinggiBambu(i) < pijakan){
                pijakan = 0;
            } else{
                pijakan = field.getTinggiBambu(i);
            }
        }
    }
    
    public boolean compare(Frog frog){
        return jump > frog.jump ? true:false;
    }

    public int getMax(Frog[] frogs){
        int max = frogs[0].jump;
        String frogColour = frogs[0].color;
        for(int i = 1; i <frogs.length; i++)
        {
            max = frogs[i].jump > max ? frogs[i].jump:max;
            frogColour = frogs[i].jump > max ? frogs[i].color:frogColour;
        }
        System.out.println("kodok warna " + frogColour + " tertinggi lompatannya");
        return max;
    }
    
}