package com.kev.chance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Entity(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    private String email;

    private String name;

    @Column(name = "num_doc")
    private String numDoc;

    @Column(name = "role_id")
    private int roleId;

    private String role;

    private String password;

    private String Salt;
}
