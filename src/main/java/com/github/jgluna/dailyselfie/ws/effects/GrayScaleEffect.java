package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.GrayscaleFilter;

import java.awt.image.BufferedImage;

public class GrayScaleEffect implements EffectInterface{
    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        GrayscaleFilter filter = new GrayscaleFilter();
        return filter.filter(imageToProcess, null);
    }
}
