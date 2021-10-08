package com.saraya.app.entity;

import javax.persistence.*;

@Entity
public class FriendFamily {

    @Id
    @Column
    long phoneNo;
    long friendAndFamily;

}
