package com.example.awtoproject.service;

import com.example.awtoproject.model.HashtagEntity;
import com.example.awtoproject.model.request.renameHashtagRequest;

public interface HashtagService {

    //SERVICE PARA ENDPOINT NUMERO 3
    HashtagEntity renameHashtagById(renameHashtagRequest request);

}
