package com.boat.boat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Mariana
 */
@Entity
@Table (name = "admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin;

    @Column (nullable = false, length = 45)
    private String email;

    @Column (nullable = false, length = 45)
    private String password;

    @Column (nullable = false, length = 250)
    private String name;

}
