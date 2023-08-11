package com.proyect.taskoffice.model;

import javax.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Integer idComentario;


}
