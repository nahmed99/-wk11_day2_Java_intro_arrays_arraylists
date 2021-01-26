import java.util.ArrayList;

public class NumberList {

    // the type needs to be non-primitive (so use Integer instead of int, for example)
    private ArrayList<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<>();
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumber(int num) {
        this.numbers.add(num);
    }

    public int getNumberAtIndex(int ind) {
        return this.numbers.get(ind);
    }

}
