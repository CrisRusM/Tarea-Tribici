package com.example.Tribici.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private String nombre;
    private String coordenadas;
    private int capacidad;

    @OneToMany
    Set<Bicicleta> bicicletas;

    @OneToMany
    Set<Uso> usos;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estacion estacion = (Estacion) o;
        return numero == estacion.numero && capacidad == estacion.capacidad && Objects.equals(id, estacion.id) && Objects.equals(nombre, estacion.nombre) && Objects.equals(coordenadas, estacion.coordenadas) && Objects.equals(bicicletas, estacion.bicicletas) && Objects.equals(usos, estacion.usos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, nombre, coordenadas, capacidad, bicicletas, usos);
    }
}
