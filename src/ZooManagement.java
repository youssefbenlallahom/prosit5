import java.util.Scanner;

 class ZooManagement {
    public static void main(String[] args) {
        Animal lion=new Animal("El branda9","lion",15,true);
        Zoo myZoo=new Zoo("safari","flower city",5);
        myZoo.addAnimal(lion,0);
        myZoo.display();
    }
}
