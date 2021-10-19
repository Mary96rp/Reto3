package com.boat.boat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Mariana
 */
@Entity
@Table (name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date devolutionDate;
    @Column(nullable = false)
    private String status="created";

    @ManyToOne
    @JoinColumn(name = "boatId")
    @JsonIgnoreProperties("reservations")
    private Boat boat;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    @OneToOne(cascade = {CascadeType.REMOVE},mappedBy="reservation")
    @JsonIgnoreProperties("reservation")
    private Score score;

}
