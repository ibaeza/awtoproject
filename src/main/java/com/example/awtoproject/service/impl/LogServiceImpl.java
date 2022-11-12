package com.example.awtoproject.service.impl;

import com.example.awtoproject.model.LogEntity;
import com.example.awtoproject.model.request.newLogRequest;
import com.example.awtoproject.model.response.createdLogResponse;
import com.example.awtoproject.repository.LogRepository;
import com.example.awtoproject.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements LogService {

    //INYECCION DE DEPENDENCIA
    @Autowired
    LogRepository repLog;

    //METODO PARA ENDPOINT NUMERO 1
    @Override
    public createdLogResponse createNewLog(newLogRequest request) {

        LogEntity newLog = new LogEntity();

        newLog.setHost(request.getHost());
        newLog.setDetails(request.getDetails());

        repLog.saveAndFlush(newLog);

        return generateResponse(newLog);
    }

    //METODO PARA ENDPOINT NUMERO 2
    @Override
    public List<LogEntity> listLogsByHashtagId(Integer id) {

        return repLog.logsByHashtagId(id);

    }

    //USO INTERNO
    private createdLogResponse generateResponse(LogEntity nuevoLog){
        createdLogResponse response = new createdLogResponse();
        response.setLogId(nuevoLog.getLogId());
        response.setHost(nuevoLog.getHost());
        response.setDetails(nuevoLog.getDetails());
        return response;
    }

}
