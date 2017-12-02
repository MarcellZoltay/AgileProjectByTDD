import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Location osztály tesztelése
 */
public class LocationTest {

    @Test
    public void testDistanceTo(){
        Location l1 = new Location("Petőfi híd budai hídfő", 47.477720, 19.061288);
        Location l2 = new Location("Boráros tér", 47.480077, 19.066298);
        double dist = l1.distanceTo(l2);
        dist = BigDecimal.valueOf(dist).setScale(2, RoundingMode.HALF_UP).doubleValue();
        Assertions.assertEquals(0.46, dist);
    }
}
