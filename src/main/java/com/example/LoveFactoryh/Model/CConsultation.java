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

    private String user;

    public CConsultation(){
    }
    public CConsultation(int id,String title, String description, String user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
