package com.boat.boat.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *Esta clase representa a la entidad Bote
 * @author Mariana
 */
@Entity  //genera la tabla
@Table (name = "boat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     *Identidficador del bote
     */
    private Integer id;

    @Column(nullable = false, length = 45)
    /**
     * Nombre del bote
     */
    private String name;

    @Column(nullable = false, length = 45)
    /**
     * Marca del bote
     */
    private String brand;

    @Column(nullable = false)
    /**
     * Año o modelod el bote
     */
    private Integer year;

    @Column(nullable = false, length = 250)
    /**
     * descripcion del bote
     */
    private String description;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("boats")
    /**
     * Relacion de la categoria con bote
     */
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "boat")
    @JsonIgnoreProperties({"boat", "client"})
    /**
     * relacion de cliente, con mensajes y bote
     */
    private List<Message> messages;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "boat")
    @JsonIgnoreProperties({"boat","message"})
    /**
     * Relacion de la reservaciones con los botes y mensaje
     */
    public List<Reservation> reservations;



}
