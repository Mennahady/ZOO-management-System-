//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion     = new Lion("Simba");
        Animal elephant = new Elephant("Dumbo");
        Animal monkey   = new Monkey("George");
        ZooKeeper zookeeper = new ZooKeeper("Alex");

        Animal[] animals = {lion,elephant,monkey};
        for (Animal animal : animals){
            zookeeper.interactWithAnimal(animal);
        }
    }
}