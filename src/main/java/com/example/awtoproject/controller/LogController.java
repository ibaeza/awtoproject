package com.example.awtoproject.controller;

import com.example.awtoproject.model.LogEntity;
import com.example.awtoproject.model.request.newLogRequest;
import com.example.awtoproject.model.response.createdLogResponse;
import com.example.awtoproject.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogController {

    //INYECCION DE DEPENDENCIA
    @Autowired
    LogService logService;

    //ENDPOINT REQUERIDO NUMERO 1
    @RequestMapping(method= RequestMethod.POST, value = "/api/v1/logs")
    public ResponseEntity<createdLogResponse> newLog(@RequestBody newLogRequest request) {

        return ResponseEntity.ok(logService.createNewLog(request));

    }

    //ENDPOINT REQUERIDO NUMERO 2
    @RequestMapping(method= RequestMethod.GET, value = "/api/v1/logs/hashtag/{hashtagId}")
    public List<LogEntity> logsByHashtagId(@PathVariable("hashtagId") Integer id) {

        return logService.listLogsByHashtagId(id);

    }

}
