public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32 ;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static boolean IsExtremeTemperature(double celsius) {
        if (celsius > 50 || celsius < -40) {
            return true;
        } else {
            return false;
        }
    }

    static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(10));
        System.out.println(celsiusToFahrenheit(20));
        System.out.println(IsExtremeTemperature(10));

        System.out.println(kelvinToCelsius(300));

    }
}
