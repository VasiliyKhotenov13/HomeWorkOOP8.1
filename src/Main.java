import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {
    public static void main(String[] args) {

        Number num1 = new Number(2, 2);
        Number num2 = new Number(2, 3);
        Number num3 = new Number(2, 4);
        Number num4 = new Number(2, 5);
        Number num5 = new Number(2, 6);
        Number num6 = new Number(2, 7);
        Number num7 = new Number(2, 8);
        Number num8 = new Number(2, 9);
        Number num9 = new Number(3, 3);
        Number num10 = new Number(4, 4);
        Number num11 = new Number(5, 5);
        Number num12 = new Number(6, 6);
        Number num13 = new Number(7, 7);
        Number num14 = new Number(8, 8);
        Number num15 = new Number(9, 9);

        Set<Number> numberSet = new HashSet<>();

        numberSet.add(num1);
        numberSet.add(num2);
        numberSet.add(num3);
        numberSet.add(num4);
        numberSet.add(num5);
        numberSet.add(num6);
        numberSet.add(num7);
        numberSet.add(num8);
        numberSet.add(num9);
        numberSet.add(num11);
        numberSet.add(num12);
        numberSet.add(num13);
        numberSet.add(num14);
        numberSet.add(num15);

        Iterator item = numberSet.iterator();
        while (item.hasNext()) {
            System.out.println(item.next());
        }

        MultiTable multiTable = new MultiTable();
        System.out.println(multiTable);

    }
}