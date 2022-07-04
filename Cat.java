public class Cat extends Animal implements LivingThing{
    public void checkup(){
        System.out.println("Cat Checkup");
    }; //from animal

    @Override
    public void breath() {
        System.out.println("Cat is breathing");
    }; //from animal

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }; //from livingthing

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }; //from livingthing
};