package com.tutorial.toturial.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="SAMPLE")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString

public class Sample {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String userId;

    private String password;

    private String name;
}
