public class Main {
    public static void main(String[] args) {
      Cat cat = new Cat("Deizi",5);
      Dog dog = new Dog("Sharik",6);
      Kitty kitty = new Kitty("Mihail",1,"Misha");
        System.out.println(cat.say());
        System.out.println(kitty.say());
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(kitty);
        dog.eat();
        cat.run();

    }
}