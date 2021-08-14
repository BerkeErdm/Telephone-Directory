package com.example.telephonedirectory.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema= "publictd" ,  name = "enrolle")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Enrolle {

    @Id
    @Column(name = "id" , nullable = false)
    private String id ;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "surname" , nullable = false)
    private String surname;

    @Column(name = "phone_number" , nullable = false)
    private String phoneNumber;

    @Column(name = "description" )
    private String description;

}
