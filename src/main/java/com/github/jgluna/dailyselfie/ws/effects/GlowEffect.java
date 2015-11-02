package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.GlowFilter;

import java.awt.image.BufferedImage;

public class GlowEffect implements EffectInterface{
    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        GlowFilter filter = new GlowFilter();
        return filter.filter(imageToProcess, null);
    }
}
