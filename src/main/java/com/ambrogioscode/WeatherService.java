package com.ambrogioscode;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class WeatherService {

    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    private final OkHttpClient client = new OkHttpClient();

    public String getWeather(String city) throws Exception {

        String url = BASE_URL +
                "?q=" + city +
                "&appid=" + Config.API_KEY +
                "&units=metric";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("HTTP error: " + response.code());
            }
            return response.body().string();
        }
    }
}
