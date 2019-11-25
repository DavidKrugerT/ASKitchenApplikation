package com.example.kitchenapplikation.model;

public class ScheduleModel {
    private String date;
    private String shift;
    private PersonModel personModel = new PersonModel();

    public PersonModel getPersonModel() {
        return personModel;
    }

    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}
