import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, TemperatureConverter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, TemperatureConverter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(TemperatureConverter.IsExtremeTemperature(51));
        assertTrue(TemperatureConverter.IsExtremeTemperature(-41));

        assertFalse(TemperatureConverter.IsExtremeTemperature(50));
        assertFalse(TemperatureConverter.IsExtremeTemperature(-40));
        assertFalse(TemperatureConverter.IsExtremeTemperature(20));
    }
}
