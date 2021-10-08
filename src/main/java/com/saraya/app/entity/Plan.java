package com.saraya.app.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Plan {
    @Id
    @Column
    Integer planId;
    String planName;
    Integer nationalRate;
    Integer localRate;

}
