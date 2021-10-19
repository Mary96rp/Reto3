package com.boat.boat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 *
 * @author Mariana
 */
@Entity
@Table (name = "message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;

    @Column(nullable = false, length = 250)
    private String messageText;

    @ManyToOne
    @JoinColumn(name="boatId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Boat boat;

    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;



}
