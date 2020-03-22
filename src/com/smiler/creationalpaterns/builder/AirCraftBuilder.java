package com.smiler.creationalpaterns.builder;

import com.smiler.creationalpaterns.builder.entities.IAirecraft;

public abstract class AirCraftBuilder{

    public void buildEngine(){
    }

    public void buildWings(){

    }

    public void buildCockpit(){

    }

    public void buildBathrooms(){

    }

    abstract public IAirecraft getResult();

}
