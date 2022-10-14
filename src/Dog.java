public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Cat is runnig");
    }

    @Override
    public String toString() {
        return super.getName()+" "+super.getAge();
    }
}
