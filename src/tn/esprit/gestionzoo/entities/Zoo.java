package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 5; // Nombre de cages maximum dans le zoo

    public Zoo(String name, String city) {
        this.animals = new Animal[25];  // Capacité maximale du zoo
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        else{
            this.name = name;
        }
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal already exists");
            return false;  // L'animal existe déjà, on ne l'ajoute pas
        }

        // Vérifie si le zoo est plein avant d'ajouter un animal
        if (isZooFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo is at full capacity, can't add more animals.");
            return false;
        }

        // Ajouter l'animal à la première case vide
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                if(animals[i].age>=0){
                    animals[i] = animal;  // Ajout de l'animal
                    System.out.println("tn.esprit.gestionzoo.entities.Animal added at index: " + i);
                    return true;
                }
                else{
                    System.out.println("tn.esprit.gestionzoo.entities.Animal not added (invalid age)");
                    return false;
                }

            }
        }
        System.out.println("tn.esprit.gestionzoo.entities.Animal not added (no space available)");
        return false;  // Ce cas ne devrait normalement jamais être atteint à cause de la vérification de `isZooFull()`
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;  // Si une case est vide, le zoo n'est pas plein
            }
        }
        return true;  // Si aucune case n'est vide, le zoo est plein
    }

    public void display() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of Cages: " + this.nbrCages);
        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimal();  // Afficher l'animal si il n'est pas null
            }
        }
    }

    public int searchAnimal(Animal animal) {
        int index = 0;
        for (Animal i : animals) {
            if (i != null && i.equals(animal)) {
                return index;  // Retourne l'index de l'animal trouvé
            }
            index++;
        }
        return -1;  // Si l'animal n'est pas trouvé, retourne -1
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;  // L'animal n'existe pas dans le zoo
        }
        animals[index] = null;  // Supprimer l'animal
        return true;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2) {
        int countZ1 = 0;
        int countZ2 = 0;
        for(int i = 0; i < z1.animals.length; i++) {
            if(z1.animals[i]!=null){
                countZ1++;
            }
        }
        for(int i = 0; i < z2.animals.length; i++) {
            if(z2.animals[i]!=null){
                countZ2++;
            }
        }
        if(countZ1 > countZ2){
            return z1;
        }else{
            return z2;
        }
    }
}
