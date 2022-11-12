package com.example.awtoproject.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class newLogRequest {

    //REQUEST UTILIZADO PARA ENDPOINT REQUERIDO NUMERO 1
    private String host;
    private String details;
    private Set hashtags;

}
