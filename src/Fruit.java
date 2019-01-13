public abstract class Fruit {
    String Name;
    Double Weight;

    public Fruit(String name, double weight) {
        Name = name;
        Weight = weight;
    }

    public double sizeF(){
        return Weight;
    }
}
