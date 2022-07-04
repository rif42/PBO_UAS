public class Dog extends Animal{
    public void checkup(){
        System.out.println("Dog Checkup");
    };

    @Override
    public void breath() {
        System.out.println("Cat is breathing");
    }; //from animal
};