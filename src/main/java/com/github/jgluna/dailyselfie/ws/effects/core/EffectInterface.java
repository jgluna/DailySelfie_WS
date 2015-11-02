package com.github.jgluna.dailyselfie.ws.effects.core;

import java.awt.image.BufferedImage;

public interface EffectInterface {

    BufferedImage apply(BufferedImage imageToProcess);
}
