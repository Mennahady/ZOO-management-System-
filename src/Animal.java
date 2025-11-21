public abstract class Animal {
    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void makeSound();
    public abstract void performAction();

    public void eat(){
        System.out.println (name + "is eating");
    }
    public void showInfo(){
        System.out.println("Animal Name   : " + name);
        System.out.println("Species       : " + species);
    }
}
