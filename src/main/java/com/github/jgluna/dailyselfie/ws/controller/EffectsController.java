package com.github.jgluna.dailyselfie.ws.controller;

import com.github.jgluna.dailyselfie.ws.effects.core.EffectsProcessor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RequestMapping("/effect")
@RestController
public class EffectsController {

    private static final String APPLY_PATH = "/apply";
    private static final String IMAGE_PARAM = "image";
    private static final String EFFECTS_PARAM = "effects";

    @ResponseBody
    @RequestMapping(value = APPLY_PATH, method = RequestMethod.POST)
    public ResponseEntity<InputStreamResource> applyEffect(@RequestParam(value = IMAGE_PARAM) MultipartFile image,
                                                           @RequestParam(value = EFFECTS_PARAM) List<String> effects) {
        InputStream is;
        EffectsProcessor processor = new EffectsProcessor();
        BufferedImage outputImage = null;
        try {
            is = image.getInputStream();
            if (is != null) {
                System.out.println("image received!! yay!!");
                outputImage = processor.applyEffects(ImageIO.read(is), effects);
            } else {
                System.out.println("buuuuuuuu");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (outputImage != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                ImageIO.write(outputImage, "jpg", baos);
                return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(new ByteArrayInputStream(baos.toByteArray())));
            } catch (IOException e) {
                e.printStackTrace();
                return ResponseEntity.badRequest().body(null);
            }
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
