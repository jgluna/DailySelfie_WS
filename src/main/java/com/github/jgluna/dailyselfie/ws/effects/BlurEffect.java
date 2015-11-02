package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.GaussianFilter;

import java.awt.image.BufferedImage;

public class BlurEffect implements EffectInterface {

    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        GaussianFilter filter = new GaussianFilter();
        filter.setRadius(5);
        return filter.filter(imageToProcess, null);
    }
}
