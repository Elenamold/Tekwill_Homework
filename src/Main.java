// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {

        TemperatureConverter tConverter = new TemperatureConverter();
        double tCelcius , tFahrenheit ;
        tCelcius = tConverter.toCelsius(65.0) ;
        tFahrenheit = tConverter.toFahrenheit(20.0) ;
        System.out.printf("\nTemperatura in Celcius is: %0,5.2fC°", tCelcius);

       // System.out.println("\n" + tConverter.toCelsius(65.0).toString());

        System.out.printf("\nTemperatura in Fahrenheit is: %0, 6.2fF°", tFahrenheit );
        }
    }
