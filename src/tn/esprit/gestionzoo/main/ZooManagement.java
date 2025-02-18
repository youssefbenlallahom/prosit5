package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;
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

        System.out.println(flipper);
        System.out.println(pingu);

    }
}
