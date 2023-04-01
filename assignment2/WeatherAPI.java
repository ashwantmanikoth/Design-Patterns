package assignment2;

import java.net.*;
import java.io.*;
import org.json.JSONObject;


public class WeatherAPI {
  public static void main(String[] args) {
    String location = "london";

    String apiKey = "cd2d86decdc44d8e9f403147230104";

    try {
      URL url = new URL("http://api.weatherapi.com/v1/current.json?key="+apiKey+"&q="+location+"&aqi=no" );
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("Content-Type", "application/json");

      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();

        JSONObject jsonObject = new JSONObject(response.toString());
        System.out.println(jsonObject.toString(4)); // pretty-print the JSON response
      } else {
        System.out.println("Error response code: " + responseCode);
      }
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}
