package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof org.launchcode.techjobs_oo.Location)) return false;
        org.launchcode.techjobs_oo.Location location = (org.launchcode.techjobs_oo.Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
