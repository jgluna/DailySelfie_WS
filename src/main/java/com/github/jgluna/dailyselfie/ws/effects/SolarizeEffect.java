package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.SolarizeFilter;

import java.awt.image.BufferedImage;

public class SolarizeEffect implements EffectInterface {
    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        SolarizeFilter filter = new SolarizeFilter();
        return filter.filter(imageToProcess, null);
    }
}
