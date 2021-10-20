package com.company.carspecs;

import com.company.colors.Color;
import com.company.colors.EminentWhitePearl;
import com.company.engines.Engine;
import com.company.engines.Liter35;

public class LexusSpecFactory implements CarSpecFactory {
    @Override
    public Color createColor() {
        return new EminentWhitePearl();
    }

    @Override
    public Engine createEngine() {
        return new Liter35();
    }
}
