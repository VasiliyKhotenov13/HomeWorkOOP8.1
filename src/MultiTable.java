import java.util.*;
public class MultiTable {
    private final Set<Number> set = new HashSet<>();

    public MultiTable() {
        Random random = new Random();
        while (set.size() < 15) {
            set.add(new Number(random.nextInt(10), random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
