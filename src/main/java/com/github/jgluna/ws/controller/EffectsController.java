package com.github.jgluna.ws.controller;

import com.github.jgluna.ws.model.EffectsRequestWrapper;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class EffectsController {

    private static final String BASE_PATH = "/effect";
    private static final String IMAGE_PARAM = "image";
    private static final String BODY_PARAM = "body";

    @ResponseBody
    @RequestMapping(value = BASE_PATH, method = RequestMethod.POST)
    public ResponseEntity<InputStreamResource> applyEffect(@RequestParam(value = IMAGE_PARAM) MultipartFile image,
                                                           @RequestParam(value = BODY_PARAM) List<String> effects) {
        InputStream is;
        try {
            is = image.getInputStream();
            if (is != null) {
                System.out.println("image received!! yay!!");
            } else {
                System.out.println("buuuuuuuu");
            }
            //TODO processing
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TODO change for production code, this is only to test the service
        System.out.println("Received request");
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("kitten.png");
        if (resourceAsStream != null) {
            System.out.println("Kitten found!!");
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(resourceAsStream));
        } else {
            System.out.println("Kitten not found :'(");
            return ResponseEntity.badRequest().body(null);
        }
    }
}
