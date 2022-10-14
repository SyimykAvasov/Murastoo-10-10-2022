public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public String say(){
        return "Cat say";
    }

    @Override
    public String toString() {
        return super.getName()+" "+super.getAge();
    }
}
