public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("cat");
        cat1.greets();
        Dog dog1 = new Dog("dog");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigdog");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("cat");
        animal1.greets();
        Animal animal2 = new Dog("dog");
        animal2.greets();
        Animal animal3 = new BigDog("bigdog");
        animal3.greets();

//        Animal animal4 = new Animal();
//      Animal là interface nên không thể tạo object

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
//        Cat cat2 = (Cat)animal2;
//        animal2 là dog , không thể ép kiểu về cat vì đó là hai đối tượng khác nhau.
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}