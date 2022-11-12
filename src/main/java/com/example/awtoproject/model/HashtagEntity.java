package com.example.awtoproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="aw_hashtag")
public class HashtagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int hashtagId;

    @Column(name="description", length = 50, nullable = false)
    private String description;

}
