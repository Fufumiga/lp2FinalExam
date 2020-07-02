package br.edu.unijui;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;


class City implements Serializable {

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
    
    public String[] getDates(){
        return isolationMap.keySet().toArray(new String[isolationMap.size()]);
    }
    
    public float getIndex(String date){
        return isolationMap.get(date);
    }
    
        
}
