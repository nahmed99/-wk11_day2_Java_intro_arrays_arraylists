import java.util.ArrayList;

public class NumberList {

    // the type needs to be non-primitive (so use Integer instead of int, for example)
    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers) {
//        this.numbers = new ArrayList<>();
        this.numbers = numbers;
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

    public int getTotal() {

//        int total = 0;
//        for (int i=0; i < this.numbers.size(); i++) {
//            total += getNumberAtIndex(i);
//        }
//        return total;


        // An alternative way to (for) loop - similar to JS and Python

        int total = 0;
        for(int number : this.numbers) {
            total += number;
        }
        return total;
    }

}
