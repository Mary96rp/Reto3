package com.boat.boat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Mariana
 */
@Entity  //genera la tabla
@Table(name = "score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 250)
    private String messageText;
    @Column(nullable = false)
    private Integer stars;

    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;

}
