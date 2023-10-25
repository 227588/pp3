public class TemperatureTest{
    public static void main(String[] arg){
        System.out.println(Temperature.CelsiusToKelvin(25));
        System.out.println(Temperature.CelsiusToFahrenheit(25));
        System.out.println(Temperature.FahrenheitToCelsius(100));
        System.out.println(Temperature.FahrenheitToKelvin(100));
        System.out.println(Temperature.KelvinToCelsius(0));
        System.out.println(Temperature.KelvinTofahrenheit(0));
    }
}