package com.example.awtoproject.repository;

import com.example.awtoproject.model.LogEntity;
import com.example.awtoproject.model.query.HashtagLogQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Integer> {

    //QUERY UTILIZADA PARA ENDPOINT REQUERIDO NUMERO 2
    @Query(nativeQuery = true, value = HashtagLogQuery.LOGS_BY_HASHTAGID)
    List<LogEntity> logsByHashtagId(@PathVariable Integer id);

}
