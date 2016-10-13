package com.cinzia.booking.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cinzia on 12/10/2016.
 */
@Entity
@Setter
@Getter
@Table(name = "entries")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id")
    private Study study;
}
