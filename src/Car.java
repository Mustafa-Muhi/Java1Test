public class Car {
    private int speed;
    private String color;
    private String model;
    private boolean isHatchBack;

    public Car(){

    }

    public Car(int speed, String color){
        this.speed = speed;
        this.color=color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public Car(int speed, String color, String model, boolean isHatchBack) {
        this.speed = speed;
        this.color = color;
        this.model = model;
        this.isHatchBack = isHatchBack;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }



    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }



    public void setHatchBack(boolean hatchBack) {
        isHatchBack = hatchBack;
    }
    public boolean isHatchBack() {
        return isHatchBack;
    }

    void turnOn(){
        System.out.println("Car is turned on");
    }



}
