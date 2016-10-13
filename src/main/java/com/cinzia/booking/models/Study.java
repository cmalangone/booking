package com.cinzia.booking.models;

/**
 * Created by cinzia on 12/10/2016.
 */

import javax.persistence.*;
import java.util.Set;

import lombok.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Entity
@Getter
@Setter
@Table(name = "studies")
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Study(){
    }

    public Study(String name){
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String name) {
        this.name = name;
    }


}
