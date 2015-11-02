package com.github.jgluna.dailyselfie.ws.effects;

import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class SolarizeEffectTest extends TestCase {

    public void testApply() throws Exception {
        InputStream is = getClass().getClassLoader().getResourceAsStream("kitten2.jpg");
        SolarizeEffect effect = new SolarizeEffect();
        BufferedImage filtered = effect.apply(ImageIO.read(is));
        File fileToSave = new File("kitten2_solarized.jpg");
        if(!fileToSave.exists()){
            fileToSave.createNewFile();
        }
        ImageIO.write(filtered, "jpg", fileToSave);
    }
}