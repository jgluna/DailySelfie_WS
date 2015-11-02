package com.github.jgluna.dailyselfie.ws.effects;

import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class GrayScaleEffectTest extends TestCase {

    public void testApply() throws Exception {
        InputStream is = getClass().getClassLoader().getResourceAsStream("kitten2.jpg");
        GrayScaleEffect effect = new GrayScaleEffect();
        BufferedImage filtered = effect.apply(ImageIO.read(is));
        File fileToSave = new File("kitten2_gray.jpg");
        if(!fileToSave.exists()){
            fileToSave.createNewFile();
        }
        ImageIO.write(filtered, "jpg", fileToSave);
    }
}