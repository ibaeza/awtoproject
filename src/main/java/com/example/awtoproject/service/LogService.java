package com.example.awtoproject.service;

import com.example.awtoproject.model.LogEntity;
import com.example.awtoproject.model.request.newLogRequest;
import com.example.awtoproject.model.response.createdLogResponse;

import java.util.List;

public interface LogService {

    //SERVICE PARA ENDPOINT NUMERO 1
    createdLogResponse createNewLog(newLogRequest request);

    //SERVICE PARA ENDPOINT NUMERO 2
    List<LogEntity> listLogsByHashtagId(Integer id);

}
