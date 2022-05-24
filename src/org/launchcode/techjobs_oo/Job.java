package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;

public class Job {

    private int id;
    private static int nextId = 1;
    private static final String DEFAULT_MESSAGE = "Data not available";

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //3.1/3.2
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    //5
    @java.lang.Override
    public java.lang.String toString() {
        if(name == null && employer == null && location == null && positionType == null && coreCompetency == null){
             String id = doesNotContainAnyFieldOtherThanId();
            return id;
        } else {
            return String.format("id=%s\nname=%s\nemployer=%s\nlocation=%s\npositionType=%s\ncoreCompetency",
                    id,
                    name == null ? DEFAULT_MESSAGE : name,
                    employer == null ? DEFAULT_MESSAGE : employer,
                    location == null ? DEFAULT_MESSAGE : location,
                    positionType == null ? DEFAULT_MESSAGE : positionType,
                    coreCompetency == null ? DEFAULT_MESSAGE : coreCompetency);
        }

    }

    public String doesNotContainAnyFieldOtherThanId() {
            return "OOPS! This job does not seem to exist";

    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}