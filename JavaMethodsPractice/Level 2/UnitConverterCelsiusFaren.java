class UnitConvertorCelsiusFaren {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println(convertFahrenheitToCelsius(32));
        System.out.println(convertCelsiusToFahrenheit(0));
        System.out.println(convertPoundsToKilograms(10));
        System.out.println(convertKilogramsToPounds(10));
        System.out.println(convertGallonsToLiters(1));
        System.out.println(convertLitersToGallons(1));
    }
}
