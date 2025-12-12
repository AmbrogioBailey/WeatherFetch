package com.ambrogioscode;

public class Config {
    // A constant value that never changes while the program runs
    public static final String API_KEY;

    static {
        String apiKey = System.getenv("OPENWEATHER_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException("\"Missing environment variable OPENWEATHER_API_KEY. \" +\n" +
                    "                    \"Set it before running the app.\"");
        }
        API_KEY = apiKey;
    }

}
