import java.util.Arrays;
import java.util.Comparator;

public class pratice_compare {
    public static void main(String[] args) {
        String str = "aa";
        String str1 = "bb";
        String str2 = "aa";
        String str3 = "a";


        System.out.println(str.compareTo(str2)); // 0
        System.out.println(str.compareTo(str1)); // -1
        System.out.println(str.compareTo(str3)); // 1

        System.out.println("=====");

        Integer x = 3;
        Integer y = 4;

        Double z = 2.3;

        System.out.println(x.compareTo(y)); // -1
        System.out.println(x.compareTo(3)); // 0
        System.out.println(x.compareTo(2)); // 1
        System.out.println(z.compareTo(2.9)); // -1

        System.out.println("=====");

        String tmp = "abc";
        String tmp1 = "acb";

        compare com = new compare();
        System.out.println(com.compare(tmp,tmp1));

        System.out.println("======");

        String[] test = {"abc","cea","bac"};
        Arrays.sort(test, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(test));//[abc, bac, cea]
    }


}

class compare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
