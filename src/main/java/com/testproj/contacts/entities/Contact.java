package com.testproj.contacts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String first_name;


    private String last_name;


    private String business_phone;


    private String personal_phone;


    private String mobile_phone;


    private String personal_email;
}