package io.example.jackson.samples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Module module = new Module();
        module.setId(UUID.randomUUID());
        module.setName(new I18NProperty<>());
        module.setDescription(new I18NProperty<>());
        module.getName().set("zh-CN", "连词");
        module.getName().set("en-US", "Conjunction");
        module.getDescription().set("zh-CN", "学习连词。");
        module.getDescription().set("en-US", "Learn conjunction.");

        ObjectMapper mapper = new ObjectMapper();
        String mapJakcson = null;
        try {
            mapJakcson = mapper.writeValueAsString(module);
            System.out.println(mapJakcson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
