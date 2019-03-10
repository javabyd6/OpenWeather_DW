package pl.sda.openWeather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper ();

        Weather weather = mapper.readValue(new URL ("http://api.apixu.com/v1/current.json?key=1b301cfd93fe4ee0bd9123325191003&q=Bydgoszcz"),Weather.class);

        System.out.println ("W mieście "+weather.getLocation ().getName ()+" obecnie jest temperatura "+weather.getCurrent ().getTemp_c ()+"°C");
    }
}
