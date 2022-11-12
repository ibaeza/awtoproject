package com.example.awtoproject.controller;

import com.example.awtoproject.model.HashtagEntity;
import com.example.awtoproject.model.request.renameHashtagRequest;
import com.example.awtoproject.service.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HashtagController {

    //INYECCION DE DEPENDENCIA
    @Autowired
    HashtagService hashtagService;

    //ENDPOINT REQUERIDO NUMERO 3
    @RequestMapping(method= RequestMethod.PUT, value = "/api/v1/hashtags")
    public HashtagEntity renameHashtag(@RequestBody renameHashtagRequest request) {

        return hashtagService.renameHashtagById(request);

    }

}
