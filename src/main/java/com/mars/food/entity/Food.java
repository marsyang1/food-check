package com.mars.food.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Mars on 2015/12/7.
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Food implements Stomach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SID")
    private String sid = UUID.randomUUID().toString();
    @Column(name = "ID")
    private String id = "";
    @Column(name = "NAME")
    private String name = "";
    @Column(name = "DESCRIPTION")
    private String description="";

    public Food(String id,String name){
        setId(id);
        setName(name);
    }

}