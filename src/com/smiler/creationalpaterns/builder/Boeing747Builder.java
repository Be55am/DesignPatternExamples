package com.smiler.creationalpaterns.builder;

import com.smiler.creationalpaterns.builder.entities.Boeing747;
import com.smiler.creationalpaterns.builder.entities.IAirecraft;

public class Boeing747Builder extends AirCraftBuilder {

    Boeing747 boeing747;

    @Override
    public void buildEngine() {
        super.buildEngine();

        this.boeing747.aircraftType = this.boeing747.aircraftType.concat(" boeing engin");
    }

    @Override
    public void buildWings() {

        super.buildWings();
        this.boeing747.aircraftType = this.boeing747.aircraftType.concat(" + boeing wings");
    }

    @Override
    public void buildCockpit() {
        super.buildCockpit();
        this.boeing747 = new Boeing747();
        this.boeing747.aircraftType = "Boeing_Cockpit";
    }

    @Override
    public void buildBathrooms() {
        super.buildBathrooms();
        this.boeing747.aircraftType =  this.boeing747.aircraftType.concat(" Have Bathrooms");
    }

    @Override
    public IAirecraft getResult() {
        return boeing747;
    }
}
