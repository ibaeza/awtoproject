package com.example.awtoproject.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Data
@Table(name="aw_hashtag_log")
public class HashtagLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int hashtagLogId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private LogEntity awLog;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hashtag_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private HashtagEntity awHashtag;


}
