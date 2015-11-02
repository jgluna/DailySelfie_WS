package com.github.jgluna.dailyselfie.ws.effects.core;

import com.github.jgluna.dailyselfie.ws.effects.*;

public class EffectsFactory {

    private static final String BLUR_EFFECT = "blur";
    private static final String GLOW_EFFECT = "glow";
    private static final String GRAYSCALE_EFFECT = "gray_scale";
    private static final String INVERT_EFFECT = "invert";
    private static final String SOLARIZE_EFFECT = "solarize";
    private static final String NOISE_EFFECT = "noise";

    public static EffectInterface getEffect(String effectName) {
        EffectInterface effect = null;
        switch (effectName.toLowerCase()) {
            case BLUR_EFFECT:
                effect = new BlurEffect();
                break;
            case GLOW_EFFECT:
                effect = new GlowEffect();
                break;
            case GRAYSCALE_EFFECT:
                effect = new GrayScaleEffect();
                break;
            case INVERT_EFFECT:
                effect = new InvertEffect();
                break;
            case SOLARIZE_EFFECT:
                effect = new SolarizeEffect();
                break;
            case NOISE_EFFECT:
                effect = new NoiseEffect();
                break;
        }
        return effect;
    }
}
