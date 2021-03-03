import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static class Fruit  implements Comparable<Fruit>{
        public String name;
        public int quantity;
        public Fruit(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }

        @Override
        public int compareTo(Fruit o) {
            return name.compareTo(o.name);
        }

        public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        public static Comparator<Fruit> quantComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.quantity- o2.quantity;
            }
        };
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("apple",100);
        fruits[1] = new Fruit("orange",70);
        fruits[2] = new Fruit("banana", 80);
        fruits[3] = new Fruit("pineapple",90);

        Arrays.sort(fruits);

        System.out.println(fruits[1].name); // banana

        Arrays.sort(fruits,Fruit.nameComparator);

        System.out.println(fruits[1].name); //banana

        Arrays.sort(fruits,Fruit.quantComparator);

        System.out.println(fruits[0].name); // orange
    }
}
