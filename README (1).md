
# WeatherFetch 🌤️  
Java Console Weather App using OpenWeatherMap

WeatherFetch is a Java console application that fetches **live weather data** from the OpenWeatherMap API and displays a readable weather report for any city the user enters.

The app was built to practice:

- Calling a **real REST API** from Java
- Working with **JSON** using Gson
- Structuring code into **clean, testable layers**
- Using **Maven** for dependency management

---

## ✨ Features

- Enter any city name (including multi-word cities like `New York`, `Los Angeles`, etc.)
- Fetches **current weather** from OpenWeatherMap:
  - City name
  - Temperature in **Celsius** and **Fahrenheit**
  - “Feels like” temperature in both units
  - Weather conditions (e.g., `clear sky`, `light rain`)
  - Humidity
  - Wind speed in **mph** (converted from m/s)
- Menu-style flow:
  - Type city names repeatedly to check multiple locations
  - Type `q` to quit safely
- Basic error handling for invalid requests

---

## 🛠 Tech Stack

- **Language:** Java (17+)
- **Build tool:** Maven
- **HTTP client:** OkHttp
- **JSON parsing:** Gson
- **Weather API:** OpenWeatherMap

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/AmbrogioBailey/WeatherFetch.git
cd WeatherFetch
```

### 2. Set your API key as an environment variable

macOS / Linux:

```bash
export OPENWEATHER_API_KEY="your_real_key_here"
```

Windows PowerShell:

```powershell
$env:OPENWEATHER_API_KEY="your_real_key_here"
```

IntelliJ:

- Run → Edit Configurations → Environment Variables → Add:
  - Name: `OPENWEATHER_API_KEY`
  - Value: your API key

---

## ▶️ Run the App

IntelliJ: Run `Main.java`

Maven CLI:

```bash
mvn compile exec:java -Dexec.mainClass="com.ambrogioscode.Main"
```

---

## 💡 Example Output

```
---------- WEATHER REPORT ----------
City: Philadelphia
Temperature: 33°F, 1°C
Feels Like: 21°F, -6°C
Conditions: clear sky
Humidity: 46%
Wind Speed: 18 mph
------------------------------------
```

---

## 🧠 What I Learned

- REST API integration using OkHttp  
- JSON deserialization using Gson  
- Clean separation of concerns  
- Secure API key handling via environment variables  
- Maven dependency management  
- Console UI and control flow  

---

## 🚧 Future Improvements

- ANSI color output  
- Condition-based emoji icons  
- JavaFX GUI version  
- ZIP code lookup  
- Caching previous search results  
- Spring Boot backend version  

---

## 📄 License

Free to use for learning, personal, and portfolio purposes.
