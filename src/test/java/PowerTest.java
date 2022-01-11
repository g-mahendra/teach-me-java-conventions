import org.junit.Test;
import org.junit.Before;
import powerpackage.PowerFinder;
import static org.junit.Assert.assertEquals;

public class PowerTest {

    private PowerFinder powerFinder;

    @Before
    public void setup() {
        powerFinder = new PowerFinder();
    }

    @Test
    public void testThatOneRaisedToOneReturnsOne() {
        assertEquals( "PowerFinder.of did not return expected output.", powerFinder.of(1, 1), 1);
    }
    @Test
    public void testThatTwoRaisedToOneReturnsTwo() {
        assertEquals( "PowerFinder.of did not return expected output.", powerFinder.of(2, 1), 2);
    }
    @Test
    public void testThatTwoRaisedToTwoReturnsFour() {
        assertEquals( "PowerFinder.of did not return expected output.", powerFinder.of(2, 2), 4);
    }
    @Test
    public void testThatThreeRaisedToTwoReturnsNine() {
        assertEquals( "PowerFinder.of did not return expected output.", powerFinder.of(3, 2), 9);
    }
}
