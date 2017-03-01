import org.junit.Test;
import pl.rn.WetherService;

import static org.junit.Assert.assertEquals;

/**
 * Created by rob on 25.02.17.
 */

public class WetherServiceTest {

    private WetherService ws = new WetherService();

    @Test
    public void getCountries() {

        String cities = ws.getCountries("Germany");
        System.out.println(cities);
        String w = ws.getWeatherFor("Germany", "Berlin");
        System.out.printf(w);
        assertEquals("a", w);

    }

}