package com.saraya.app.entity;



import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {
    @Id @Column
    long phoneNo;
    String name;
    String email;
    int age;
    String password;
    String address;

    @Enumerated(EnumType.STRING)
    Gender gender;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "phoneNo")
    List<FriendFamily> friendAndFamily;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "planId")
    Plan currentPlan;

}
