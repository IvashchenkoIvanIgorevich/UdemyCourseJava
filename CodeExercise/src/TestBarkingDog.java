import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestBarkingDog {
     BarkingDog obj;

    @Before
    public void setUp() {
        obj = new BarkingDog();
    }

    @Test
    public void shouldWakeUp_InvalidHour_False(){
        assertFalse(obj.shouldWakeUp(true, -1));
    }

    @Test
    public void shouldWakeUp_ShouldWakeUp_True(){
        assertTrue(obj.shouldWakeUp(true, 7));
    }

    @Test
    public void shouldWakeUp_DogIsNotBarking_False(){
        assertFalse(obj.shouldWakeUp(false, 2));
    }
}
