package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+", Habitat: "+habitat;
    }
    public void swim(){
        System.out.println("This Aquatic Animal is Swimming...");
    }
}
