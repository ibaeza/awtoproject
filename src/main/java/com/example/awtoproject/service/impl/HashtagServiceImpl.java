package com.example.awtoproject.service.impl;

import com.example.awtoproject.model.HashtagEntity;
import com.example.awtoproject.model.request.renameHashtagRequest;
import com.example.awtoproject.repository.HashtagRepository;
import com.example.awtoproject.service.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HashtagServiceImpl implements HashtagService {

    //INYECCION DE DEPENDENCIA
    @Autowired
    HashtagRepository repHashtag;

    //METODO PARA ENDPOINT NUMERO 3
    @Override
    public HashtagEntity renameHashtagById(renameHashtagRequest request) {

        HashtagEntity originalHashtag = repHashtag.findById(request.getId()).get();

        originalHashtag.setDescription(request.getDescription());

        return repHashtag.saveAndFlush(originalHashtag);
    }

}
