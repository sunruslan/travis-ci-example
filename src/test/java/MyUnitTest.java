import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void wrongTestConcatenate(){

        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "three");

        assertEquals("onethree", result);
    }
}
