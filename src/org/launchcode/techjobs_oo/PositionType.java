package org.launchcode.techjobs_oo;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PositionType{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }


// TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        PositionType that = (PositionType) object;
        return id == that.id && java.util.Objects.equals(value, that.value);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, value);
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}