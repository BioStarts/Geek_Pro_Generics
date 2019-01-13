import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        //3. Большая задача:
        Box<Apple> b = new Box<>(new ArrayList<>());//создаем коробку Яблок
        b.frBox.add(new Apple());//добавляем яблоко в коробку
        b.frBox.add(new Apple());
        b.frBox.add(new Apple());
        System.out.println(b.frBox.get(0).sizeF());//получаем размер коробки (количество яблок)
        System.out.println(b.getWeight());//получаем вес одного яблока

        Box<Apple> c = new Box<>(new ArrayList<>());//создаем 2коробку яблок для последующего пересыпания из одной коробки в другую
        c.frBox.add(new Apple());
        c.frBox.add(new Apple());
        System.out.println(c.frBox.get(0).sizeF());
        System.out.println(c.getWeight());

        System.out.println(b.compare(c)); // сравниваем вес яблочных коробок

        Box<Orange> o = new Box<>(new ArrayList<>()); //создаемкоробку Апельсинов
        o.frBox.add(new Orange());//добавляем Апельсин в коробку
        o.frBox.add(new Orange());
        System.out.println("Orange count in Box: " + c.frBox.get(0).sizeF());//получаем размер коробки (количество апельсинов)
        System.out.println("Orange weight" + c.getWeight());//получаем вес одного Апельсина

        System.out.println("Compare weight Orange(" + o.getWeight() + ") and Apple(" + c.getWeight() + ") boxes: " + o.compare(c));// сравниваем вес коробки Апельсинов и Яблок

        b.pourBoxes(c);//пересыпаем яблоки из одной коробки в другую
        System.out.println("Pour Apples from b("+ b.frBox.size() + ")" + "to c(" + (c.frBox.size()-b.frBox.size()) + ") " + "Boxes ");

        //-----------------------------------------------------------------------------------------

        ArrayChangeElementsAndConvertToList<String> strArr = new ArrayChangeElementsAndConvertToList<>("1", "2"); // создаем массив строк (2 элемента)
        ArrayChangeElementsAndConvertToList<Integer> intArr = new ArrayChangeElementsAndConvertToList<>(3, 4); // создаем массив чисел (2 эелемента)
        System.out.println("Print  String array: " + Arrays.toString(strArr.getArr())); //печатем массив строк
        System.out.println("Print  Integer array: " + Arrays.toString(intArr.getArr()));//печатаем массив чисел

        //1. Написать метод, который меняет два элемента массива местами:
        strArr.change();//меняем местами элементы в строковом массиве
        System.out.println("Print  String changed array: " + Arrays.toString(strArr.getArr()));//печатаем после замены

        intArr.change();//меняем местами элементы в числвом массиве
        System.out.println("Print  Integer changed array: " + Arrays.toString(intArr.getArr()));//печатаем после замены

        //2. Написать метод, который преобразует массив в ArrayList:
        List<String> stringList;// создаем список строк
        stringList = strArr.convert();//конвертируем наш строковый массив в строковый список
        System.out.println("Print string List: " + stringList);// печатаем список после конвертации из массива

        List<Integer> intList;// создаем список чисел
        intList = intArr.convert();//конвертируем наш численный массив в числовой список
        System.out.println("Print integer List: " + intList);// печатаем список после конвертации из массива

    }

}
