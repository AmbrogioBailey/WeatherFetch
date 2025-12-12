package com.ambrogioscode;

import com.google.gson.Gson;

public class WeatherPrinter {

    private static Gson gson = new Gson();

    private static double toFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    private static String whole(double value) {
        return String.format("%.0f", value);
    }

    private static String mph(double metersPerSecond) {
        double mphValue = metersPerSecond * 2.23694;
        return String.format("%.0f", mphValue);
    }



    public static void printWeather(String json) {
        WeatherResponse data = gson.fromJson(json, WeatherResponse.class);

        String description = data.weather != null && !data.weather.isEmpty()
                ? data.weather.getFirst().description
                : "No description available";

        System.out.println("\n---------- WEATHER REPORT ----------");
        System.out.println("City: " + data.name);
        System.out.println("Temperature: " + whole(toFahrenheit(data.main.temp)) + "°F" + ", " + whole(data.main.temp) + "°C");
        System.out.println("Feels Like: " + whole(toFahrenheit(data.main.feels_like)) + "°F" + ", " + whole(data.main.feels_like) + "°C");
        System.out.println("Conditions: " + description);
        System.out.println("Humidity: " + data.main.humidity + "%");
        System.out.println("Wind Speed: " + mph(data.wind.speed) + " mph");
        System.out.println("------------------------------------\n");
    }
}
