package com.github.jgluna.dailyselfie.ws.effects.core;

import java.awt.image.BufferedImage;
import java.util.List;

public class EffectsProcessor {

    public BufferedImage applyEffects(BufferedImage inputImage, List<String> effects) {
        for (String effect : effects) {
            inputImage = EffectsFactory.getEffect(effect).apply(inputImage);
        }
        return inputImage;
    }
}
