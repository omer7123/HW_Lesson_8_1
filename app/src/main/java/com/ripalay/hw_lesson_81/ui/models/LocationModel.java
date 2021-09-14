package com.ripalay.hw_lesson_81.ui.models;

public class LocationModel {
    private String objectCosmos;
    private String objectName;

    public LocationModel(String objectCosmos, String objectName) {
        this.objectCosmos = objectCosmos;
        this.objectName = objectName;
    }

    public String getObjectCosmos() {
        return objectCosmos;
    }

    public String getObjectName() {
        return objectName;
    }
}
