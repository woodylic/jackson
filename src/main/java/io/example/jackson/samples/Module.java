package io.example.jackson.samples;

import java.util.UUID;

public class Module {

    private UUID id;
    private I18NProperty<String> name;
    private I18NProperty<String> description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public I18NProperty<String> getName() {
        return name;
    }

    public void setName(I18NProperty<String> name) {
        this.name = name;
    }

    public I18NProperty<String> getDescription() {
        return description;
    }

    public void setDescription(I18NProperty<String> description) {
        this.description = description;
    }
}