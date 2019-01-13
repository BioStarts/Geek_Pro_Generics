import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChangeElementsAndConvertToList<T> {

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public ArrayChangeElementsAndConvertToList(T... arr) {
        this.arr = arr;
    }

    private T[] arr;

    //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public void change() {
        T[] any2 = null;
        any2 = Arrays.copyOf(this.getArr(), this.getArr().length);
        this.getArr()[0] = any2[1];
        this.getArr()[1] = any2[0];
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public List<T> convert() {
        List<T> al = new ArrayList<>();
        for (int i = 0; i < this.getArr().length; i++) {
            al.add(i, (this.getArr()[i]));
        }
        return al;
    }

}
