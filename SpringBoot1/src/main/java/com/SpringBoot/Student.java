package com.SpringBoot.SpringBoot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombook.Data;
@Entity
@Data
@Table(name="STUDENT")
public class Student{
    @Id
    @Column (name="ID")

    private int id;

    @Column (name="MARK")
    private mark;

    @Column (name="NAME")
    private String name;


}
