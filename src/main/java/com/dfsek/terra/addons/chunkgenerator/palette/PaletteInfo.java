/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.chunkgenerator.palette;

import com.dfsek.terra.api.properties.Properties;
import com.dfsek.terra.api.world.generator.Palette;


public class PaletteInfo implements Properties {
    private final PaletteHolder paletteHolder;
    private final SlantHolder slantHolder;
    private final Palette ocean;
    
    private final int seaLevel;
    
    public PaletteInfo(PaletteHolder paletteHolder, SlantHolder slantHolder, Palette ocean, int seaLevel) {
        this.paletteHolder = paletteHolder;
        this.slantHolder = slantHolder;
        this.ocean = ocean;
        this.seaLevel = seaLevel;
    }
    
    public Palette getOcean() {
        return ocean;
    }
    
    public PaletteHolder getPaletteHolder() {
        return paletteHolder;
    }
    
    public SlantHolder getSlantHolder() {
        return slantHolder;
    }
    
    public int getSeaLevel() {
        return seaLevel;
    }
}
