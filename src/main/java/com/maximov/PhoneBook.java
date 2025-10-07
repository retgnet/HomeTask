package com.maximov;

import java.util.*;

public class PhoneBook {
    private Map<String, String> mapNames = new HashMap<>();

    public void add(String number, String name) {
        mapNames.put(number, name);
    }

    public List<String> find(String name) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : mapNames.entrySet()) {
            if (name.equals(entry.getValue())) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public boolean containsPhoneNumber(String number){
        return mapNames.containsKey(number);
    }

    public Map<String, String> getMapNames() {
        return mapNames;
    }

    public void setMapNames(Map<String, String> mapNames) {
        this.mapNames = mapNames;
    }
}
