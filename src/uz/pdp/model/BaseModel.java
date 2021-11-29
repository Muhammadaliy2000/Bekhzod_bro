package uz.pdp.model;

import java.util.UUID;

public class BaseModel {
    private UUID id;
    private String name;
    private boolean isActive;

    { this.id = UUID.randomUUID(); this.isActive = true; }

    public BaseModel(String name){this.name = name;}

    public BaseModel(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
