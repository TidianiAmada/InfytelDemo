package com.saraya.app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ErrorMessage {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private int errorCode;
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
