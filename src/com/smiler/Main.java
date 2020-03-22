package com.smiler;

import com.smiler.creationalpaterns.builder.Director;
import com.smiler.creationalpaterns.builder.F16Builder;
import com.smiler.creationalpaterns.builder.entities.IAirecraft;

public class Main {

    public static void main(String[] args) {
        //Builder Pattern
        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);
        IAirecraft f16 = f16Builder.getResult();
        System.out.println("***************Builder Pattern**********");
        System.out.println(f16.aircraftType);
    }
}
