package com.company.carspecs;

import com.company.colors.Color;
import com.company.colors.Brickyard;
import com.company.engines.Engine;
import com.company.engines.Liter26;

public class NissanSpecFactory implements CarSpecFactory {
    @Override
    public Color createColor() {
        return new Brickyard();
    }

    @Override
    public Engine createEngine() {
        return new Liter26();
    }
}
