public class Temperature {

    public static double CelsiusToKelvin(double Celsius){
        return Celsius + 273.15;
    }
    public static  double CelsiusToFahrenheit(double Celsius){
        return Celsius*1.8+32;
    }
    public static  double KelvinToCelsius(double Kelvin){
        return Kelvin - 273.15;
    }
    public static  double KelvinTofahrenheit(double Kelvin){
        return (Kelvin * (9/5.0)) - 459.67;
    }
    public static  double FahrenheitToKelvin(double Fahrenheit){
        return (Fahrenheit + 459.67)/9/5.0;
    }
    public static  double FahrenheitToCelsius(double Fahrenheit){
        return (Fahrenheit-32)/1.8;
    }
}
