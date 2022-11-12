package com.example.awtoproject.repository;

import com.example.awtoproject.model.HashtagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagRepository extends JpaRepository<HashtagEntity, Integer> {

}
