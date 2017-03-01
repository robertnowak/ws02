package pl.rn;

import client.GlobalWeather;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceRef;

/**
 * Created by rob on 25.02.17.
 */
public class WetherService {

    public GlobalWeather gw = new GlobalWeather();

    public String getCountries(String country) {
        return  gw.getGlobalWeatherSoap().getCitiesByCountry(country);
    }

    public String getWeatherFor(String country, String city) {
        return  gw.getGlobalWeatherSoap().getWeather(city, country);
    }

}
