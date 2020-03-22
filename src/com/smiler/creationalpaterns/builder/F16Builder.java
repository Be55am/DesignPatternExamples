package com.smiler.creationalpaterns.builder;

import com.smiler.creationalpaterns.builder.entities.F16;
import com.smiler.creationalpaterns.builder.entities.IAirecraft;

public class F16Builder extends AirCraftBuilder {

    F16 f16;

    @Override
    public void buildWings() {

        super.buildWings();
        this.f16.aircraftType = this.f16.aircraftType.concat(" + f16 wings");
    }

    @Override
    public void buildCockpit() {
        super.buildCockpit();
        this.f16 = new F16();
        this.f16.aircraftType = "F16 Cockpit";
    }

    @Override
    public void buildEngine() {
        super.buildEngine();
        this.f16.aircraftType = this.f16.aircraftType.concat("+ F16 Engine");
    }


    @Override
    public IAirecraft getResult() {
        return f16;
    }
}
