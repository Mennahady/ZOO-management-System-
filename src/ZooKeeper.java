public class ZooKeeper {
    private String name;

    public ZooKeeper(String name){
        this.name = name;
    }
    public void interactWithAnimal(Animal a) {
        System.out.println("ZooKeeper" + name + "is interacting with " + a.getName());
        a.showInfo();
        a.makeSound();
        a.performAction();
        a.eat();

    }
}
