public class Bird extends Animal implements LivingThing {
    public void eat() {
        System.out.println("Bird is Eating");
    }; //from livingthing

    @Override
    public void walk() {
        System.out.println("Bird is walking");
    }; //from livingthing

    @Override
    public void checkup() {
        System.out.println("Checking bird");
    }; //from animal

    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }; //from animal
};