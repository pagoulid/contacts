package com.testproj.contacts.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CONTACT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @Column(name="FIRSTNAME")
    private String firstname;

    @Column(name="LASTNAME")
    private String lastname;

    @Column(name="BUSINESSPHONE")
    private String businessphone;

    @Column(name="PERSONALPHONE")
    private String personalphone;

    @Column(name="MOBILEPHONE")
    private String mobilephone;

    @Column(name="PERSONALEMAIL")
    private String personalemail;
}
