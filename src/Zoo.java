public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void addAnimal(Animal animal,int index){
        if(0<=index && index<= animals.length){
            this.animals[index]=animal;
        }else {
            System.out.println("index out of range");
        }
    }
    public void display(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Name:"+this.name);
        System.out.println("City:"+this.city);
        System.out.println("NbrCages:"+this.nbrCages);
        for (Animal animal : animals){
            if(animal!=null){
                animal.displayAnimal();
            }

        }
    }
}
