package tn.esprit.gestionzoo.main;

class ZooManagement {
    public static void main(String[] args) {
        Animal lion=new Animal("El branda9","lion",15,true);
        Animal lion2=new Animal("El branda9","lion",15,true);
        Zoo myZoo=new Zoo("safari","flower city");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion2);
        //myZoo.display();
    }
}
