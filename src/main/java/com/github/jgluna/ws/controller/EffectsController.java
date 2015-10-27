package com.github.jgluna.ws.controller;

import com.github.jgluna.ws.model.EffectsRequestWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

@RestController
public class EffectsController implements EffectsControllerInterface {

    @RequestMapping(value = BASE_PATH, method = RequestMethod.POST)
    public Void applyEffect(@Part(IMAGE_PARAMETER) TypedFile image,
                            @Part(WRAPPER_PARAMETER) EffectsRequestWrapper effectsWrapper,
                            Callback<Response> callback) {
        System.out.println("Recibi un rikues");
        return null;
    }
}
