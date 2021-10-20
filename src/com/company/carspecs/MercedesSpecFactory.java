package com.company.carspecs;

import com.company.colors.Color;
import com.company.colors.ObsidianBlack;
import com.company.engines.Engine;
import com.company.engines.Liter4;

public class MercedesSpecFactory implements CarSpecFactory {
    @Override
    public Color createColor() {
        return new ObsidianBlack();
    }

    @Override
    public Engine createEngine() {
        return new Liter4();
    }
}
