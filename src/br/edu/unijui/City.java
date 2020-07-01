package br.edu.unijui;

import java.util.HashMap;


class City {

    private String name;
    private HashMap<String, Float> isolationMap;

    public City(){
        isolationMap = new HashMap<>();
    }
    
    public City(String cityName){
        this();
        name = cityName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addIndex(String date, float percentage){
        isolationMap.put(date, percentage);
    }
    
        
}
