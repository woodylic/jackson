package io.example.jackson.samples;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.HashMap;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class I18NProperty<T> {

    private HashMap<String, T> propertyMap;

    public I18NProperty(){
        propertyMap = new HashMap<>();
    }

    public T get(String cultureCode) {
        return propertyMap.get(cultureCode);
    }

    public void set(String cultureCode, T value) {
        propertyMap.put(cultureCode, value);
    }
}