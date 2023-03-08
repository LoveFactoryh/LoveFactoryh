package com.example.LoveFactoryh.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "consultations")
public class CConsultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String title;
    private String description;

    public CConsultation(){
    }
    public CConsultation(int id,String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
