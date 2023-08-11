package com.proyect.taskoffice.model;

import javax.persistence.*;

@Entity
@Table(name = "proyectos")
public class Proyects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyeto")
    private Integer idProyecto;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    private Users  users;
}
