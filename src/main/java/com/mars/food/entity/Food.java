package com.mars.food.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Mars on 2015/12/7.
 */
@Data
@Entity
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

}