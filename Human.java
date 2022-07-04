public class Human implements LivingThing
{
    @Override
    public void eat() {
        System.out.println("Human is eating");
    };

    @Override
    public void walk() {
        System.out.println("Human is walking");
    };
};