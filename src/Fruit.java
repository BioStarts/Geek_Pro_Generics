public abstract class Fruit {
    String Name;
    Integer Weight;

    public Fruit(String name, Integer weight) {
        Name = name;
        Weight = weight;
    }

    public abstract double sizeF();
}
