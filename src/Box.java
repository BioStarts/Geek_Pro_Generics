
import java.util.List;

public class Box<T extends Fruit> {

    public Box(List<T> frBox) {
        this.frBox = frBox;
    }

    List<T> frBox;

    //Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
    public double getWeight(){
        if (this.frBox.size() == 0) {
            return 0.0;
        }
        else return (this.frBox.size() * this.frBox.get(0).Weight);
    }


    //Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра
    public boolean compare (Box<?> o){
        return Math.abs(this.getWeight() - o.getWeight())<0.0001;
    }

    //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов
    public void pourBoxes (Box<T> o){
        for (int i = 0; i < this.frBox.size(); i++) {
            o.frBox.add(this.frBox.get(i));
        }
        this.frBox.clear();
    }

    //метод добавляющий несколько фруктов в коробку

    public void addInBox (int c, T a){
        for (int i = 0; i < c; i++) {
        this.frBox.add(a);
        }
    }


}
