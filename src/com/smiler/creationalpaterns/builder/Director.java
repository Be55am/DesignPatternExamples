package com.smiler.creationalpaterns.builder;

public class Director {

    AirCraftBuilder airCraftBuilder;

    public Director(AirCraftBuilder airCraftBuilder){
        this.airCraftBuilder = airCraftBuilder;
    }

    public void construct (boolean isPassenger){
        airCraftBuilder.buildCockpit();
        airCraftBuilder.buildEngine();
        airCraftBuilder.buildWings();


        if (isPassenger){
            airCraftBuilder.buildBathrooms();
        }
    }
}
