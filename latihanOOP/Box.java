public class Box{

    private double height;
    private double width;
    private double depth;
    private String name;

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidht(double width){
        this.width = width;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getVolume(){
        double volume = height*width*depth;
        return volume;
    }
    public void setDesc(){
        System.out.println(this.name);
        System.out.println("height = " + height + " cm");
        System.out.println("width  = " + width + " cm");
        System.out.println("depth  = " + depth + " cm");
        System.out.println("volume = " + getVolume());
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getDepth(){
        return depth;
    }

}