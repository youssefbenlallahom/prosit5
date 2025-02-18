package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class ZooManagement {
    public static void main(String[] args) {
        Animal lion=new Animal("El branda9","lion",15,true);
        Animal lion2=new Animal("El branda9","lion",15,true);
        Zoo myZoo=new Zoo("safari","flower city");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion2);
        //myZoo.display();
        Dolphin flipper = new Dolphin("Flipper","Flipper", 5, true, "Ocean", 10.5f);
        Penguin pingu = new Penguin("Pingu","Pingu", 3, false, "Arctic", 20.0f);
        Aquatic Aquatic1= new Aquatic("fish","Nemo",2,false,"Ocean");
        System.out.println(flipper);
        System.out.println(pingu);
        Aquatic1.swim();


    }
}
