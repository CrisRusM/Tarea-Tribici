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
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int numTarjeta;
    private int pin;
    private double saldo;

    @OneToMany
    Set<Uso> usos;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return numTarjeta == usuario.numTarjeta && pin == usuario.pin && Double.compare(saldo, usuario.saldo) == 0 && Objects.equals(id, usuario.id) && Objects.equals(nombre, usuario.nombre) && Objects.equals(usos, usuario.usos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, numTarjeta, pin, saldo, usos);
    }
}
