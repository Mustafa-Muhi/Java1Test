public class Boy extends Person{

    private boolean hasCar;

    public Boy() {

    }

    public Boy(String name, boolean hasCar) {
        super(name);
        this.hasCar = hasCar;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("as a boy");
    }
}
