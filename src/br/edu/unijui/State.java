
package br.edu.unijui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class State {
    
    private String name;
    private HashMap<String, City> cities;
    
    public State(){
        cities = new HashMap<>();
    }
    
    public State(String name){
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<City> getCities() {       
        return cities.values();
    }

    public void addCity(City city) {
        cities.put(city.getName(), city);
    }
    
    public boolean hasCity(String cityName){
        return cities.keySet().contains(cityName);
    }
    
    public City getCity(String cityName){
       return cities.get(cityName);
    }
    
    public int cityCount(){
        return cities.size();
    }
    
    
}
