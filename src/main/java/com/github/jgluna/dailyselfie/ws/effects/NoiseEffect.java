package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.NoiseFilter;

import java.awt.image.BufferedImage;

public class NoiseEffect implements EffectInterface {
    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        NoiseFilter filter = new NoiseFilter();
        return filter.filter(imageToProcess, null);
    }
}
