package com.example.jogoVivi.Modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection= "jogo")
public class UserModal {
    @Id
    private String email;
    private String name;
    private String time;
    private int points;

    public UserModal() {
    }

    public UserModal(String email, String name, String time, int points) {
        this.email = email;
        this.name = name;
        this.time = time;
        this.points = points;
    }

    public UserModal(String email, String name) {
        this.email = email;
        this.name = name;
    }
    public UserModal(String email,int points){
        this.email = email;
        this.points = points;
    }
    public String getEmail() {
        return email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }




}
