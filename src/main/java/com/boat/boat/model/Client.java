package com.boat.boat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Mariana
 */
@Entity
@Table (name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false, length = 45)
    private String password;

    @Column(nullable = false, length =250)
    private String name;

    @Column(nullable = false, length = 3)
    private int age;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Message>messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Reservation>reservations;
}
