package com.example.awtoproject.model.query;

public class HashtagLogQuery {

    //QUERY CREADA PARA ENDPOINT REQUERIDO NUMERO 2
    public static final String LOGS_BY_HASHTAGID = "SELECT aw_log.id, aw_log.creation_date , aw_log.host, aw_log.details " +
            "FROM aw_log JOIN aw_hashtag_log ON aw_log.id = aw_hashtag_log.log_id  JOIN aw_hashtag ON aw_hashtag.id = aw_hashtag_log.hashtag_id " +
            "WHERE aw_hashtag.id =:id";

}
