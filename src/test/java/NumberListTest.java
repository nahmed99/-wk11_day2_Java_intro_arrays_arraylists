import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before() {
        myNumbers = new NumberList();
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(0, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList() {
        myNumbers.addNumber(12);
        assertEquals(1, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        myNumbers.addNumber(12);
        assertEquals(12, myNumbers.getNumberAtIndex(0));
    }

}
