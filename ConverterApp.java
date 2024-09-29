// Base class Converter
class Converter {
    // Base class can have common properties or methods if needed
}

// Currency Converter class
class CurrencyConverter extends Converter {
    double dollarToInr(double dollars) {
        return dollars * 74.0; // Example conversion rate
    }

    double euroToInr(double euros) {
        return euros * 85.0; // Example conversion rate
    }

    double yenToInr(double yen) {
        return yen * 0.55; // Example conversion rate
    }

    double inrToDollar(double inr) {
        return inr / 74.0;
    }

    double inrToEuro(double inr) {
        return inr / 85.0;
    }

    double inrToYen(double inr) {
        return inr / 0.55;
    }
}

// Distance Converter class
class DistanceConverter extends Converter {
    double meterToKm(double meters) {
        return meters / 1000.0;
    }

    double milesToKm(double miles) {
        return miles * 1.60934; // Conversion factor
    }

    double kmToMeter(double km) {
        return km * 1000.0;
    }

    double kmToMiles(double km) {
        return km / 1.60934; // Conversion factor
    }
}

// Time Converter class
class TimeConverter extends Converter {
    double hoursToMinutes(double hours) {
        return hours * 60.0;
    }

    double minutesToHours(double minutes) {
        return minutes / 60.0;
    }

    double secondsToMinutes(double seconds) {
        return seconds / 60.0;
    }

    double minutesToSeconds(double minutes) {
        return minutes * 60.0;
    }
}

// Main application class
public class ConverterApp {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();

        // Currency conversions
        System.out.printf("100 Dollars to INR: ₹%.2f%n", currencyConverter.dollarToInr(100));
        System.out.printf("100 Euros to INR: ₹%.2f%n", currencyConverter.euroToInr(100));
        System.out.printf("1000 Yen to INR: ₹%.2f%n", currencyConverter.yenToInr(1000));

        System.out.printf("7400 INR to Dollars: $%.2f%n", currencyConverter.inrToDollar(7400));
        System.out.printf("8500 INR to Euros: €%.2f%n", currencyConverter.inrToEuro(8500));
        System.out.printf("550 INR to Yen: ¥%.2f%n", currencyConverter.inrToYen(550));

        // Distance conversions
        System.out.printf("1000 Meters to KM: %.2f km%n", distanceConverter.meterToKm(1000));
        System.out.printf("10 Miles to KM: %.2f km%n", distanceConverter.milesToKm(10));

        System.out.printf("1 KM to Meters: %.2f m%n", distanceConverter.kmToMeter(1));
        System.out.printf("1 KM to Miles: %.2f miles%n", distanceConverter.kmToMiles(1));

        // Time conversions
        System.out.printf("2 Hours to Minutes: %.2f minutes%n", timeConverter.hoursToMinutes(2));
        System.out.printf("120 Minutes to Hours: %.2f hours%n", timeConverter.minutesToHours(120));

        System.out.printf("120 Seconds to Minutes: %.2f minutes%n", timeConverter.secondsToMinutes(120));
        System.out.printf("2 Minutes to Seconds: %.2f seconds%n", timeConverter.minutesToSeconds(2));
    }
}
