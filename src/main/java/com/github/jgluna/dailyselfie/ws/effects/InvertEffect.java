package com.github.jgluna.dailyselfie.ws.effects;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectInterface;
import com.jhlabs.image.InvertFilter;

import java.awt.image.BufferedImage;

public class InvertEffect implements EffectInterface{
    @Override
    public BufferedImage apply(BufferedImage imageToProcess) {
        InvertFilter filter = new InvertFilter();
        return filter.filter(imageToProcess, null);
    }
}
