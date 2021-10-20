package com.company.carspecs;

import com.company.colors.Color;
import com.company.engines.Engine;

public interface CarSpecFactory {
    Color createColor();
    Engine createEngine();
}
