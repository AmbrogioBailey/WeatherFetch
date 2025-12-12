package com.ambrogioscode;

import okhttp3.OkHttpClient;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        WeatherService weatherService = new WeatherService();
        boolean isRunning = true;

        System.out.println("-------------------------------");
        System.out.println("WELCOME TO YOUR WEATHER FETCHER");
        System.out.println("-------------------------------\n");

        while (isRunning){
            System.out.println("Enter city to check the weather(or 'q' to quit): ");
            String city = scanner.nextLine();

            if (city.equalsIgnoreCase("q")) {
                isRunning = false;
                System.out.println("\n-----------------------------------------");
                System.out.println("Thanks for using the WEATHER FETCHER app!");
                System.out.println("-----------------------------------------");
                break;
            }
            if (city.isEmpty()) {
                System.out.println("Please enter a city or country: ");
                continue;
            }
            try {
                String json = weatherService.getWeather(city);
                WeatherPrinter.printWeather(json);
            } catch (Exception e) {
                System.out.println("Could not get weather for " + "'" + city + "'" + " that is not a city we have on file! TRY ANOTHER CITY");
            }
        }


    }
}
